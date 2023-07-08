package kadai5add;

import java.util.Scanner;

/**
 * 追加課題JB51 Step-2
 * 	Customerクラス（Step1で作成済み）を利用し、以下の出力結果になるようにUseCustomer2クラス（mainメソッドを定義しているクラス）を定義しなさい。
 */
public class UseCustomer2 {

	/**
	 * mainメソッドから他のメソッドを呼び出す例
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Customer[] customerList = new Customer[3];
			// 顧客データの読み込み 
			for (int index = 0; index < customerList.length; index++) {
				System.out.println((index + 1) + "人目の顧客情報を入力してください。");
				System.out.print("ID（指定しない場合は-1と入力）：");
				int id = scanner.nextInt(); // IDの入力
				System.out.print("名前：");
				String name = scanner.next(); // 名前の入力 
				
				Customer customer;
				if (id == -1) {
					// IDが-1なら名前だけ登録
					customer = new Customer(name);
				} else {
					// IDが-1でなければIDと名前を登録
					customer = new Customer(id, name);
				}
				customerList[index] = customer;
			}
			
			// Step-2
			// 「終了」が選択されない間のループ
			while (true) {
				// 選択された処理インデックスを取得
				int operation = selectOperation(scanner);
				// 指定されたインデックスにより処理を分岐
				if (operation == 1) {
					showCustomer(customerList);
				} else if (operation == 2) {
					updateCustomer(customerList, scanner);
				} else {
					break;
				}
			}
			// 明示的に終了を表示
			System.out.println("プログラムを終了しました。");
		}
	}

	/**
	 * 処理インデックスの入力を促す
	 * @param scanner Scannerオブジェクト
	 * @return 処理インデックス
	 */
	private static int selectOperation(Scanner scanner) {
		// 処理選択のメッセージを表示
		System.out.println();
		System.out.print("操作（1：一覧表示　2：変更　9：終了）を選択してください：");
		return scanner.nextInt();
	}

	/**
	 * 顧客データを変更する
	 * @param customerList 顧客データの配列
	 * @param scanner Scannerオブジェクト
	 */
	static void updateCustomer(Customer[] customerList, Scanner scanner) {
		// 変更対象の顧客IDを入力
		System.out.print("変更するID：");
		int id = scanner.nextInt();
		// 更新対象の顧客データを格納する変数の初期化
		Customer target = null;
		// 変更対象の顧客を探索
		for (Customer customer : customerList) {
			if (customer.getId() == id) {
				// 変更対象の顧客データが見つかった場合：ループを抜ける
				target = customer;
				break;
			}
		}
		
		// 変更処理を分岐
		if (target != null) {
			// 変更対象の顧客データが見つかった場合
			System.out.print("新しいID：");
			target.setId(scanner.nextInt());
			System.out.print("新しい名前：");
			target.setName(scanner.next());
		} else {
			// 変更対象の顧客データが見つからなった場合
			System.out.println("指定したIDは存在しません。");
		}
	}

	/**
	 * 顧客データ一覧を表示する
	 * @param customerList 顧客データの配列
	 */
	static void showCustomer(Customer[] customerList) {
		System.out.println("=== 顧客データ一覧 ===");
		for (Customer customer : customerList) {
			customer.showData();
		}
	}

}
