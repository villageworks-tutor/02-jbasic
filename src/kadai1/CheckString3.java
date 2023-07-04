package kadai1;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("名前を入力してください：");
			String name = scanner.next();
			
			String message = "";
			if (name.length() <= 20) {
				message = "ようこそ" + name + "さん";
			} else {
				message = "エラー：20文字以内で入力してください";
			}
			
			System.out.println(message);
		}
	}

}
