package kadai4;

/**
 * 課題JB40 Step-1
 * 	Item（商品）クラスを作成しなさい。
 */
public class Item {
	
	/**
	 * フィールド
	 */
	String name; // 商品名
	int price;   // 価格
	
	/**
	 * Step-3 情報を出力する
	 */
	public void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("価格（税抜き）：" + price);
		System.out.println("価格（税込み）：" + (int)(price * 1.10));
	}
	
}
