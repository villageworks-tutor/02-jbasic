package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("情報を登録します");

			// 入力値を格納する変数群
			String name = "";
			String[] hobbies = new String[3];

			// ターミナルからの入力値を取得
			System.out.print("氏名：");
			name = scanner.next();
			System.out.print("趣味１：");
			hobbies[0] = scanner.next();
			System.out.print("趣味２：");
			hobbies[1] = scanner.next();
			System.out.print("趣味３：");
			hobbies[2] = scanner.next();

			// 区切り線
			System.out.println("---");
			
			// 取得した入力値を表示
			System.out.println("こんにちは" + name + "です");
			System.out.println("私の趣味は、");
			for (String hobby : hobbies) {
				System.out.println("・" + hobby);
			}
			System.out.println("です");
		}
	}

}
