package kadai5;

/**
 * 課題JB50 Step-4
 * 	ItemAction2 クラスを作成し、main メソッドで Item クラスの配列 items を作成しなさい。
 * 	items には 3 つの商品オブジェクトを格納します。 
 * 	拡張 for 文を利用してすべての情報を出力しなさい。
 */
public class ItemAction21 {

	public static void main(String[] args) {
		// 3つの要素をもつ商品クラスの配列を生成（要素一括生成）
	    Item[] items = {new Item("ロボット掃除機", 50000), 
	    				new Item("空気清浄機", 20000), 
	    				new Item("扇風機", 4000)};

	    // 拡張 for 文と showInfo メソッドを利用して1件ずつ商品情報を出力する
	    for (Item item : items) {
	    	item.showInfo();
	    	System.out.println("--");
	    }
	}

}
