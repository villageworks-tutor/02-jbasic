package kadai2add;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			// コンソールから入力値を取得
			System.out.print("１つ目の文字列を入力してください：");
			String input1 = scanner.next();
			System.out.print("２つ目の文字列を入力してください：");
			String input2 = scanner.next();

			// 入力値を比較
			String message = "２つの文字列は";
			if (input1.equals(input2)) {
				message += "同じです";
			} else {
				message += "異なります";
			}
			
			// 比較結果を表示
			System.out.println(message);
			
		}
	}

}
