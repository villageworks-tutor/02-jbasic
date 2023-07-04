package kadai1;

import java.util.Scanner;

public class CheckInteger3 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルからの入力値を取得
			System.out.print("年齢を入力してください：");
			int age = scanner.nextInt();

			// 入力値を判定
			String message = "";
			if (age >= 0 && age <= 130) {
				message = "正しい年齢です";
			} else {
				message = "0～130で入力してください";
			}
			
			// 判定結果の表示
			System.out.println(message);
			
		}
	}

}
