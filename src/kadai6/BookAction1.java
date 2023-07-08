package kadai6;

/**
 * 課題JB60 Step-3
 */
public class BookAction1 {

	public static void main(String[] args) {
		// ■Step3 の処理
		// Bookクラスのオブジェクトを生成しb1に代入
		Book b1 = new Book("走れメロス", 450, "太宰治");
		// 書籍情報を出力
		b1.showInfo();
		
		System.out.println("---");
		
		// ■Step4 の処理
		// Book クラスのオブジェクトを生成し Itemクラスの変数 i1 に代入
		Item i1 = new Book("シャーロック・ホームズ", 600, "コナン・ドイル");
		// 商品情報を出力
		i1.showInfo();
		
	}

}
