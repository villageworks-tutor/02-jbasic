package kadai5add;

/**
 * 追加課題JB51 Step-1
 * 	コンストラクタ、カプセル化
 */
public class Customer {

	/**
	 * フィールド
	 */
	private int id;      // ID
	private String name; // 名前

	/**
	 * デフォルトコンストラクタ
	 */
	public Customer() {}
	
	/**
	 * コンストラクタ
	 * @param name 名前
	 */
	public Customer(String name) {
		this.name = name;
	}

	/**
	 * コンストラクタ
	 * @param id   ID
	 * @param name 名前
	 */
	public Customer(int id, String name) {
		this(name);
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	/**
	 * フィールドの値を表示する
	 */
	public void showData() {
		System.out.println(this.id + "：" + this.name);
	}
	

}
