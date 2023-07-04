package kadai2;

import java.util.Scanner;

public class CheckPassword1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
				System.out.print("パスワードを入力してください：");
				String input = scanner.next();
				if (input.equals("himitu")) {
					System.out.println("ログインできました");
					break;
				} else {
					System.out.println("不正解です");
				}
			}
		}
	}

}
