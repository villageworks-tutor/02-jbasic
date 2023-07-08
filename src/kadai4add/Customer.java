package kadai4add;

/**
 * 追加課題JB41 Step-2
 * 	コンストラクタ、カプセル化不要
 */
public class Customer {
	/**
	 * フィールド
	 */
	int id;      // ID
	String name; // 名前
	
	public void setData(String n) {
		name = n;
	}
	
	public void setData(int no, String n) {
		id = no;
		name = n;
	}
	
	public void showData() {
		System.out.println(id + "：" + name);
	}
	
}
