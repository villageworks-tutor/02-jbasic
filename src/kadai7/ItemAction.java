package kadai7;

import java.util.ArrayList;
import java.util.List;

/**
 * 課題JB70 Step-4
 * 	ItemActionクラスのmainメソッドから利用しなさい。
 * 	Itemクラスのオブジェクトを保持できるリストに商品を３つ追加し、拡張for文を利用して出力します。
 */
public class ItemAction {

	public static void main(String[] args) {
		// Itemクラスのリストを作成
		List<Item> items = new ArrayList<>();
		// 商品をリストに追加（３つ）
		items.add(new Item("ロボット掃除機", 50000));
		items.add(new Item("ドラム式洗濯機", 200000));
		items.add(new Item("液晶テレビ", 10000));
		
		//拡張for文を利用して1件ずつ商品情報を出力する
		for (Item item : items) {
			item.showInfo();
			System.out.println("---");
		}

	}

}
