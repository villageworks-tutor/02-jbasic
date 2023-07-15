package kadai7add;

/**
 * 追加課題JB71 Step-1
 */
public class Book extends Item {

	/**
	 * フィールド
	 */
	private String author; // 著者

	/**
	 * デフォルトコンストラクタ
	 */
	public Book() {}

	/**
	 * コンストラクタ
	 * @param name   商品名
	 * @param price  価格
	 * @param author 著者
	 */
	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}

	/** アクセサメソッド群 */
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void showInfo() {
		System.out.println(this.getName() + "（" + this.author + "）/" + this.getPrice() + "円");
	}
	
}
