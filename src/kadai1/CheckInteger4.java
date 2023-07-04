package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {

			// ターミナルからの入力値を取得
			System.out.print("数字を入力してください：");
			int number = scanner.nextInt();

			// 入力値の判定１：正負の判定
			String message = number + "は";
			if (number > 0) {
				message += "正の";
			} else {
				message += "負の";
				number *= -1;
			}
			
			// 入力値の判定２：偶奇の判定
			if (number % 2 == 0) {
				message += "偶数";
			} else {
				message += "奇数";
			}
			
			// 判定結果の表示
			message += "です";
			System.out.println(message);
			
		}
	}

}
