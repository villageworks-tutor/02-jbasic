package kadai1add;

import java.util.Scanner;

public class Test3 {

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

			// 点数の最大値とその科目名を取得
			int maxScore = japanese;
			String subject = "国語";
			if (maxScore < math) {
				maxScore = math;
				subject = "数学";
			}
			if (maxScore < english) {
				maxScore = english;
				subject = "英語";
			}
			
			// 結果メッセージの表示
			String message = "最高点は" + subject + "で" + maxScore + "点です";
			System.out.println(message);
			
		}
	}

}
