package kadai1add;

import java.util.Scanner;

public class Test1 {

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

			// 点数の合計を計算
			int total = japanese + math + english;
			// 平均点の計算
			double average = total / 3.0;
			
			// 計算結果の表示
			System.out.println("平均は" + average + "点です");
			
		}
	}

}
