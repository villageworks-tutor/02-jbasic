package kadai7;

import java.util.Scanner;

/**
 * 課題JB70 Step-1
 * 	価格チェックプログラムを作りなさい。
 */
public class PriceErrorCheck {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int price = 0; // 価格初期値:0
			System.out.print("価格：");
			String priceString = scanner.next();
			// 整数チェック（エラーの場合は終了）
			try {
				price = Integer.parseInt(priceString);
			} catch (NumberFormatException e) {
				System.out.println("整数で入力してください");
				return;
			}
			
			// 範囲チェック（エラーの場合は終了）
			if (price < 0) {
				System.out.println("マイナスの値です");
				return;
			}
			
			System.out.println(price + "円を登録しました");
		}
	}
}
