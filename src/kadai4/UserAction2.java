package kadai4;

import java.util.Scanner;

/**
 * 課題JB40 Step-5
 * 	キーボードから取得した名前と年齢でUserクラスのオブジェクトを作成し、出力しなさい。
 */
public class UserAction2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// Userオブジェクトを生成し変数userに代入する
			User user = new User();
			// キーボードから名前と年齢を取得しuserにセットする
			System.out.print("名前：");
			user.name = scanner.next();
			System.out.print("年齢：");
			user.age = scanner.nextInt();
			
			System.out.println("---");
			System.out.println("会員を登録しました");
			
			// userの情報を出力する
			user.showInfo();
		}
	}

}
