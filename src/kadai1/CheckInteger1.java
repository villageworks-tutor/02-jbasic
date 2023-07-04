package kadai1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {

		if (args[0].equals("default")) {
			System.out.println("【基本プログラミング例】");
			defaultMethod();
		} else {
			System.out.println("【応用プログラミング例】");
			advancedMethod();
		}
		
	}

	static void advancedMethod() {
		
		// ターミナルから入力値を取得するツールの読込み
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルからの入力値を取得
			System.out.print("数字を入力してください：");
			int number = scanner.nextInt();
			
			// 入力値を判定
			String message = "";
			if (number == 7) {
				message = "大当たり！";
			} else {
				message = "ハズレ";
			}
			
			// 判定結果を表示
			System.out.println(message);
		}
		
	}

	static void defaultMethod() {

		// ターミナルから入力値を取得するツールの読込み
		Scanner scanner = new Scanner(System.in);
		
		// ターミナルからの入力値を取得
		System.out.print("数字を入力してください：");
		int number = scanner.nextInt();
		
		// 入力値を判定
		if (number == 7) {
			// 判定結果を表示
			System.out.println("大当たり！");
		} else {
			// 判定結果を表示
			System.out.println("ハズレ");
		}
		
		// ターミナルから入力値を取得するツールを解放
		scanner.close();
		
	}
	

}
