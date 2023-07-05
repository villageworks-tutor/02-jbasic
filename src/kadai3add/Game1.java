package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
		// 予め乱数を発生させておく
		Random random = new Random();
		int seed = random.nextInt(99);
		seed = 40;
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("数字を入力してください：");
				int input = scanner.nextInt();
				
				if (input == seed) {
					// 等しい場合はループを抜ける
					System.out.println("** 当たりです **");
					break;
				}
				
				String message = "";
				if (input > seed) {
					message = "** 大きすぎます **";
				} else  {
					message = "** 小さすぎます **";
				}
				System.out.println(message);
				/*
				if (input > seed) {
					message = "** 大きすぎます **";
					System.out.println(message);
				} else if (input < seed) {
					message = "** 小さすぎます **";
					System.out.println(message);
				} else {
					message = "** 当たりです **";
					System.out.println(message);
					break;
				}
				*/
				
			}
			/*
			System.out.print("数字を入力してください：");
			int input;
			while ((input = scanner.nextInt()) != seed) {
				if (input > seed) {
					System.out.print("** 大きすぎです **");
				} else {
					System.out.print("** 小さすぎです **");
				}
			}
			System.out.println("** 当たりです **");
			*/
		}
		
	}

}
