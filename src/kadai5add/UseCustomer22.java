package kadai5add;

import java.util.Scanner;

/**
 * 追加課題JB51 Step-2
 * 	switch-case文およびマジックナンバーを回避するためのクラス定数を利用した例
 */
public class UseCustomer22 {

	/**
	 * クラス定数
	 */
	private static final int OPE_LIST = 1;
	private static final int OPE_UPDATE = 2;
	private static final int OPE_QUIT = 9;
	
	/**
	 * mainメソッドから他のメソッドを呼び出す例
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// ■ Step-1
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
			
			// ■ Step-2
			// 「終了」が選択されない間のループ：ループ条件は要考察
			int operation = 0;
			while ((operation = selectOperation(scanner)) != OPE_QUIT) {
				// 指定されたインデックスにより処理を分岐：switch-case文を用いた例
				switch (operation) {
				case OPE_LIST:
					showCustomer(customerList);
					break;
				case OPE_UPDATE:
					updateCustomer(customerList, scanner);
					break;
				default:
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
