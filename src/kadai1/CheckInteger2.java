package kadai1;

import java.util.Scanner;

public class CheckInteger2 {

	public static void main(String[] args) {
		
		// ターミナルから入力値を取得するツールの読込み
		Scanner scanner = new Scanner(System.in);
		
		// ターミナルからの入力値（x）を取得
		System.out.print("xの値を入力してください：");
		int x = scanner.nextInt();
		
		// ターミナルからの入力値（y）を取得
		System.out.print("yの値を入力してください：");
		int y = scanner.nextInt();
		
		// 入力値の判定
		String message = "";
		if (x > y) {
			message = "xはyより大きいです";
		} else if (x < y) {
			message = "xはyより小さいです";
		} else {
			message = "xとyは等しいです";
		}
		
		// 判定結果の表示
		System.out.println(message);
		
		// ターミナルから入力値を取得するツールを解放
		scanner.close();
	}

}
