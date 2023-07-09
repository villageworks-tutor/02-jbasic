package kadai7;

/**
 * 課題JB70 Step-4
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

	/** アクセサメソッド群 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("商品名：" + this.name);
		System.out.println("価格：" + this.price + "円");
	}
	
}
