package kadai6add;

/**
 * 追加課題JB61 Step-1
 * 	ゲームで利用するベースとなるキャラクタークラス（Humanクラス）を定義しなさい。
 */
public class Human {
	
	/**
	 * フィールド
	 */
	private String name; // 名前

	/**
	 * デフォルトコンストラクタ
	 */
	public Human() {}

	/**
	 * コンストラクタ
	 * @param name 名前
	 */
	public Human(String name) {
		this.name = name;
	}

	/** アクセサメソッド群 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 情報を表示する
	 */
	public void info() {
		System.out.println("名前：" + this.name);
	}
	
	/**
	 * 攻撃する
	 */
	public void attack() {
		System.out.println("攻撃した");
	}
	
	
}
