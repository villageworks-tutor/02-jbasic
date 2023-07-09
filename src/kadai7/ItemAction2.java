package kadai7;

import java.util.ArrayList;
import java.util.List;

/**
 * 課題JB70 Step-5
 * 	BookActionクラスのmainメソッドから利用しなさい。
 * 	Itemクラスのオブジェクトを保持できるリストに商品または書籍を３つ追加し、拡張for文を利用して出力します。
 */
public class ItemAction2 {

	public static void main(String[] args) {
		// Itemクラスのリストを作成
		List<Item> items = new ArrayList<>();
		// 商品または書籍をリストに追加（３つ）
		items.add(new Item("ロボット掃除機", 50000));
		items.add(new Book("鬼滅の包丁", 500, "Go峠"));
		items.add(new Book("1ピース", 500, "小田"));
		
		//拡張for文を利用して1件ずつ商品情報を出力する
		for (Item item : items) {
			item.showInfo();
			System.out.println("---");
		}

	}

}
