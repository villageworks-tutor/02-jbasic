package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("パスワードを入力してください：");
			while (!(scanner.next().equals("himitu"))) {
				System.out.print("パスワードを入力してください：");
			}
			System.out.println("ログインできました");
		}
	}

}
