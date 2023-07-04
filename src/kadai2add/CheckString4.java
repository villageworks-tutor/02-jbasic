package kadai2add;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			// コンソールから入力値を取得
			System.out.print("繰り返す回数を入力してください：");
			int repeat = scanner.nextInt();
			
			String[] inputs = new String[repeat];
			
			for (int i = 0; i < repeat; ++i) {
				System.out.print((i + 1) + "つ目の文字列を入力してください：");
				inputs[i] = scanner.next();
			}
			
			int maxLength = 0;
			String word = "";
			// 拡張for文を利用した場合
			for (String input : inputs) {
				if (maxLength < input.length()) {
					maxLength = input.length();
					word = input;
				}
			}
			/* for分を利用した場合
			for (int i = 0; i < inputs.length; ++i) {
				if (maxLength < inputs[i].length()) {
					maxLength = inputs[i].length();
					word = inputs[i];
				}
			}
			*/
			System.out.println("最も長い文字列は「" + word + "」です");
		}
	}

}
