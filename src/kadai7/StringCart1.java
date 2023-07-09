package kadai7;

import java.util.ArrayList;
import java.util.List;

/**
 * 課題JB70 Step-2
 * 	商品をリストに一つずつ追加し、拡張for文を利用して出力しなさい。
 */
public class StringCart1 {

	public static void main(String[] args) {
		// 文字列を保持できるリストの作成
		List<String> items = new ArrayList<String>();
		 
		// 「ロボット掃除機」の追加
		items.add("ロボット掃除機");
		// 「ドラム式洗濯機」の追加
		items.add("ドラム式洗濯機");
		// 「液晶テレビ」の追加
		items.add("液晶テレビ");
		
		// 拡張for文を利用して全商品を出力する
		for (String item : items) {
			System.out.println(item);
		}
	}

}
