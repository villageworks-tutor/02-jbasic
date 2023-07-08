package kadai5add;

import java.util.Scanner;

/**
 * 追加課題JB51 Step-1
 * 	顧客情報（IDと名前）を3人分入力し、それを配列に格納し表示するプログラムを作成しなさい。
 * 	なお、IDを指定したくない場合、IDに-1と指定します（内部的には0として登録される）。
 * 	UseCustomer1クラス（mainメソッドを定義しているクラス）の実行結果が以下になるようにCustomerクラスを定義しなさい。
 */
public class UseCustomer1 {

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
			 
			// 顧客データ表示 
			System.out.println();
			System.out.println("=== 顧客データ一覧 ===");
			for (Customer customer : customerList) {
				customer.showData();
			}
		}
	}

}
