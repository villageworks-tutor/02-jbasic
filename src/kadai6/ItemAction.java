package kadai6;

/**
 * 課題JB60 Step-1
 * 	Item（商品）クラスを作成し、ItemActionクラスのmainメソッドから利用しなさい。
 */
public class ItemAction {

	public static void main(String[] args) {
		// Item オブジェクト（ロボット掃除機/50000円）を生成
		Item item = new Item("ロボット掃除機", 50000);
		// 商品情報を出力
		item.showInfo();
		
		System.out.println("---"); 
		
		// Item オブジェクト（洗濯機/200000円）を生成 
		item = new Item("洗濯機", 200000);
		// 商品情報を出力
		item.showInfo();
	}

}
