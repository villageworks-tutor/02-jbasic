package kadai5add;

import java.util.Scanner;

/**
 * 追加課題JB51 Step-2
 * 	Customerクラス（Step1で作成済み）を利用し、以下の出力結果になるようにUseCustomer2クラス（mainメソッドを定義しているクラス）を定義しなさい。
 */
public class UseCustomer21 {

	/**
	 * mainメソッドで完結した例
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
			 
			// 「終了」が選択されない間のループ
			while (true) {
				// 処理選択のメッセージを表示
				System.out.println();
				System.out.print("操作（1：一覧表示　2：変更　9：終了）を選択してください：");
				// 選択された処理インデックスを取得
				int operation = scanner.nextInt();
				if (operation == 1) {
					System.out.println("=== 顧客データ一覧 ===");
					for (Customer customer : customerList) {
						customer.showData();
					}
				} else if (operation == 2) {
					System.out.print("変更するID：");
					int id = scanner.nextInt();
					boolean isMatched = false;
					Customer target = null;
					for (Customer customer : customerList) {
						if (customer.getId() == id) {
							target = customer;
							break;
						}
					}
					if (target == null) {
						System.out.println("指定したIDは存在しません。");
					} else {
						System.out.print("新しいID：");
						target.setId(scanner.nextInt());
						System.out.print("新しい名前：");
						target.setName(scanner.next());
					}
				} else {
					break;
				}
			 }
			 System.out.println("終了");
			 
		}
	}

}
