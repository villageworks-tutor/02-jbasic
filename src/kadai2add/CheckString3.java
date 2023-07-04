package kadai2add;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			// コンソールから入力値を取得
			System.out.print("繰り返す回数を入力してください：");
			int repeat = scanner.nextInt();
			
			String dupe = "";
			for (int i = 0; i < repeat; ++i) {
				System.out.print((i + 1) + "つ目の文字列を入力してください：");
				dupe += scanner.next();
				System.out.println(dupe);
			}
			
		}
	}

}
