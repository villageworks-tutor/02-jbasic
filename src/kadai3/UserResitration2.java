package kadai3;

import java.util.Scanner;

public class UserResitration2 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("名前を入力してください：");
			String name = scanner.next();
			
			if (hasNameError(name)) {
				return;
			}
			
			System.out.print("年齢を入力してください：");
			int age = scanner.nextInt();
			
			if (hasAgeError(age)) {
				return;
			}
			
			System.out.println("名前：" + name + "、年齢：" + age + "で登録しました");
			
		}

	}
	
	/**
	 * 名前のエラーチェックをする
	 * @param name チェック対象の名前
	 * @return エラーがある場合はtrue、それ以外はfalse
	 */
	static boolean hasNameError(String name) {
		String errorMessage = "";
		// 文字数チェック
		if (name.length() > 20) {
			errorMessage = "名前は20文字以内で入力してください";
			System.out.println(errorMessage);
			return true;
		}
		// 利用可チェック
		if (name.equals("admin")) {
			errorMessage = "利用できない名前です";
			System.out.println(errorMessage);
			return true;
		}
		// 禁止文字チェック
		if (name.contains("㌔")) {
			errorMessage = "名前に禁止文字が含まれています";
			System.out.println(errorMessage);
			return true;
		}
		
		return false;

	}
	
	/**
	 * 年齢のエラーチェックをする
	 * @param age チェック対象の年齢
	 * @return エラーがある場合はtrue、それ以外はfalse
	 */
	static boolean hasAgeError(int age) {
		// 範囲チェック：0以上130以下であるかどうか
		if (!(age >= 0 && age <= 130)) {
			String errorMessage = "年齢は0歳以上130歳以下で入力してください";
			System.out.println(errorMessage);
			return true;
		}
		
		return false;
	}

}
