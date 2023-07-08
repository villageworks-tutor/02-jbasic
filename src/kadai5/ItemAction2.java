package kadai5;

/**
 * 課題JB50 Step-4
 * 	ItemAction2クラスを作成し、mainメソッドでItemクラスの配列itemsを作成しなさい。
 * 	itemsには3つの商品オブジェクトを格納します。 
 * 	拡張for文を利用してすべての情報を出力しなさい。
 */
public class ItemAction2 {

	public static void main(String[] args) {
		// 3つの要素をもつ商品クラスの配列を生成（要素個別生成）
	    Item[] items = new Item[3];
	    items[0] = new Item("ロボット掃除機", 50000);
	    items[1] = new Item("空気清浄機", 20000);
	    items[2] = new Item("扇風機", 4000);

	    // 拡張 for 文と showInfo メソッドを利用して1件ずつ商品情報を出力する
	    for (Item item : items) {
	    	item.showInfo();
	    	System.out.println("--");
	    }
	}

}
