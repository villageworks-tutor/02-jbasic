package kadai5;

/**
 * 課題JB50 Step-1
 * 	Item（商品）クラスを作成しなさい。
 */
public class Item {
	
	/**
	 * フィールド
	 */
	private String name; // 商品名
	private int price;   // 価格
	
	/**
	 * デフォルトコンストラクタ
	 */
	public Item() {}
	
	/**
	 * コンストラクタ
	 * @param name  商品名
	 * @param price 価格
	 */
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	/**
	 * アクセサメソッド群
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * Step-3：情報出力用 showInfo メソッド
	 */
	public void showInfo() {
		System.out.println("商品名：" + this.name);
		System.out.println("価格：" + this.price + "円");
	}
	
}
