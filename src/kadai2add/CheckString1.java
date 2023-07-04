package kadai2add;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("文字列を入力してください：");
			String input = scanner.next();
			int length = input.length();
			System.out.println("文字列の長さは" + length + "です");
		}
	}

}
