package kadai3;

import java.util.Scanner;

public class UserResitration1 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("名前を入力してください：");
			String name = scanner.next();
			
			// 文字数チェック
			if (name.length() > 20) {
				System.out.println("名前は20文字以内で入力してください");
				return;
			}
			// 利用可チェック
			if (name.equals("admin")) {
				System.out.println("利用できない名前です");
				return;
			}
			// 禁止文字チェック
			if (name.contains("㌔")) {
				System.out.println("名前に禁止文字が含まれています");
				return;
			}
			
			System.out.print("年齢を入力してください：");
			int age = scanner.nextInt();
			
			// 範囲チェック（0以上130以下であるかどうか）
			if (!(age >= 0 && age <= 130)) {
				System.out.println("年齢は0歳以上130歳以下で入力してください");
				return;
			}
			
			System.out.println("名前：" + name + "、年齢：" + age + "で登録しました");
			
		}

	}

}
