package kadai1add;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルから各科目の点数を取得
			System.out.print("国語の点数を入力してください：");
			int japanese = scanner.nextInt();
			System.out.print("数学の点数を入力してください：");
			int math = scanner.nextInt();
			System.out.print("英語の点数を入力してください：");
			int english = scanner.nextInt();

			// 各点数の範囲による合否判定
			String message = "";
			if (japanese >= 80 && math >= 75 && english >= 70) {
				message = "合格です";
			} else {
				message = "不合格です";
			}
			
			// 判定結果の表示
			System.out.println(message);
			
		}
	}

}
