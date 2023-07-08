package kadai6;

/**
 * 課題JB60 Step-5
 */
public class BookAction2 {

	public static void main(String[] args) {
		// Item クラスの配列を生成し Item とBookのオブジェクトを複数格納する
		Item[] items = new Item[] {new Item("ロボット掃除機", 50000), 
								   new Book("鬼滅の包丁", 459, "60峠こよはる"), 
								   new Book("1ピース", 500, "尾田A一郎")};
		// 繰り返し処理を利用して 1件ずつ商品情報を出力する
		for (Item item : items) {
			item.showInfo();
			System.out.println("---");
		}
		
	}

}
