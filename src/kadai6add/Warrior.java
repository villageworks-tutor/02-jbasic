package kadai6add;

/**
 * 追加課題JB61 Step-2
 * 	Humanクラス（Step1で作成済み）を継承したWarriorクラス）を定義しなさい。
 */
public class Warrior extends Human {
	
	/**
	 * フィールド
	 */
	private String type; // 種別

	/**
	 * デフォルトコンストラクタ
	 */
	public Warrior() {}

	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param type 種別
	 */
	public Warrior(String name, String type) {
		super(name);
		this.type = type;
	}

	/** アクセサメソッド群 */
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void info() {
		System.out.print("種別：" + this.type + "　");
		super.info();
	}

	@Override
	public void attack() {
		System.out.print("「" + this.type + "」は");
		super.attack();
	}
	
	
	
}
