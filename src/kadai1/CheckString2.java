package kadai1;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルからの入力値を取得
			System.out.print("色を入力してください：");
			String color = scanner.next();
			
			// 入力値の判定
			String message = "です";
			switch (color) {
			case "red":
				message = "赤" + message;
				break;
			case "green":
				message = "緑" + message;
				break;
			case "blue":
				message = "青" + message;
				break;
			default:
				message = "他の色を入力してください";
				break;
			}

			// 判定結果の表示
			System.out.println(message);
			
		}
	}

}
