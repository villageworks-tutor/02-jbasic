package kadai1;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルからの入力値を取得
			System.out.print("パスワード：");
			String input = scanner.next();

			// 入力値の判定
			String message = "";
			if (input.equals("himitu")) {
				message = "一致しました";
			} else {
				message = "一致しませんでした";
			}

			// 判定結果の表示
			System.out.println(message);
		}
	}

}
