package kadai4;

/**
 * 課題JB40 Step-2
 * 	Item（商品）クラスをItemActionクラスのmainメソッドから利用しなさい。
 */
public class ItemAction {

	public static void main(String[] args) {
		// ■Step2の処理
		// Itemクラスのオブジェクトを生成し変数item1に代入する
		Item item1 = new Item();
		// item1のフィールドに商品名「絵本」、価格「1000」を設定する
		item1.name = "絵本";
		item1.price = 1000;
		// item1を利用して商品名と価格の情報を出力する
		System.out.println("名前：" + item1.name);
		System.out.println("価格：" + item1.price);
		
		System.out.println("---");
		
		// ■Step3の処理
		// Itemクラスのオブジェクトを生成し変数item2に代入する
		Item item2 = new Item();
		// item1のフィールドに商品名「シャンプー」、価格「222」を設定する
		item2.name = "シャンプー";
		item2.price = 222;
		// showInfo()メソッドを利用して情報を出力する
		item2.showInfo();
		
	}

}
