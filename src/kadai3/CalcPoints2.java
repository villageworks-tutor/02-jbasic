package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			// ターミナルから入力値を取得
			System.out.print("購入金額：");
			int price = scanner.nextInt();
			System.out.println("1:プレミアム会員、2:無料会員");
			System.out.print("会員ランク：");
			int rank = scanner.nextInt();

			// 取得した入力値からポイントを計算
			int point = calcPoints(price, rank);
			
			// 会員ランクに幼児たメッセージの生成
			String message =  + point + "ポイント付与されます";
			if (rank == 1) {
				message = "プレミアム会員は" + message;
			} else {
				message = "無料会員は" + message;
			}
			
			// メッセージを表示
			System.out.println(message);
			
		}
	}
	
	/**
	 * 会員ランクに応じたポイントを計算する
	 * @param price 購入金額
	 * @param rank  会員ランク
	 * @return 会員ランクに応じたポイント数
	 */
	static int calcPoints(int price, int rank) {
		// 会員ランクに応じたポイント率の初期化
		double rate = 0.10;
		if (rank == 1) {
			// 会員ランクがプレミアム会員の場合：ポイント率を0.20に変更
			rate = 0.20;
		}
		// ポイントを返却
		return (int)(price * rate);
	}
}
