package kadai5;

/**
 * 課題JB50 Step-2
 * 	ItemAction1 クラスを作成し main メソッドから Item クラスを利用しなさい。
 */
public class ItemAction {

	public static void main(String[] args) {
		// ■Step2 の処理
		// 商品オブジェクトを生成 
		Item item = new Item();
		// セッターを利用して情報（絵本/1000 円）をセットする 
		item.setName("絵本");
		item.setPrice(1000);
		// ゲッターを利用して商品の情報を出力する
		System.out.println("商品名：" + item.getName());
		System.out.println("価格：" + item.getPrice() + "円");
		
		System.out.println("---");
		
		// ■Step4 の処理
		// コンストラクタを利用し初期化（シャンプー/222 円）と同時に商品オブジェクトを生成する
		item = new Item("シャンプー", 222);
		// 商品情報出力用のメソッドを利用して出力する
		item.showInfo();
	}

}
