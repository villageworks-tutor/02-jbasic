package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		
		// 購入金額
		int price = 1000;
		
		// プレミア会員のポイント計算
		int point1 = getPoints(price, true);
		System.out.println("プレミアム会員には" + point1 + "ポイント付与されます");
		
		// 無料会員のポイント計算
		int point2 = getPoints(price, false);
		System.out.println("無料会員には" + point2 + "ポイント付与されます");
	}
	
	/**
	 * 会員の種別に従ったポイントを計算する
	 * @param price     購入金額
	 * @param isPremium プレミアム会員の場合はtrue、それ以外はfalse
	 * @return 会員の種別に従って計算されたポイント数
	 */
	static int getPoints(int price, boolean isPremium) {
		// 会員種別に応じたポイント率の初期化
		double rate = 0.0;
		if (isPremium) {
			// プレミアム会員の場合
			rate = 0.20;
		} else {
			// 無料会員の場合
			rate = 0.10;
		}
		// ポイントを返却
		return (int)(price * rate);
		
	}

}
