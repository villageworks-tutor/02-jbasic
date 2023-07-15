package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 追加課題JB71 Step-1
 * 	ver.13 商品追加と書籍追加のメソッドの統合と商品生成Factoryクラスの導入
 * 	ver.12 クラス定数導入版：操作インデックスの定数化
 * 	ver.11 メソッド分割版：以下の種類のメソッドを定義
 * 	　・操作メニュー表示メソッド
 * 　　・選択された操作メニューに対応する処理用メソッド
 * 	ver.10 mainメソッドのみの完結版：最低限クリアしてほしいバージョン
 */
public class CartSystem13 {
	
	/**
	 * クラス定数
	 */
	// 操作インデックス定数群
	private static final int OPE_ADD_ITEM = 1;
	private static final int OPE_ADD_BOOK = 2;
	private static final int OPE_QUIT     = 9;
	// 対象商品種別定数群
	private static final int TYPE_ITEM = 1;
	private static final int TYPE_BOOK = 2;
	// 対象商品種別定数配列
	private static final String[] TARGET_TYPES = new String[] {"商品", "書籍"};
	
	// 商品情報保存リスト（フィールド）
	private static List<Item> cart = new ArrayList<Item>(); 
	// スキャナークラス（フィールド） 
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		while (true) {
			// 操作メニューの表示と選択したメニューの取得
			int operation = selectMenu();
			
			// メニューインデックスによる操作の分岐
			switch (operation) {
			case OPE_ADD_ITEM:
			case OPE_ADD_BOOK:
				// 商品または書籍をカートに追加
				addItem(operation);
				// カートの商品一覧を表示
				showCart();
				break;
			case OPE_QUIT:
				// 終了の場合
				System.out.println();
				System.out.println("プログラムを終了します");
				return;
			default:
				// 想定外の操作インデックスが入力された場合
				System.out.println();
				System.out.println("定義外の操作が指定されたので、プログラムを終了します");
				return;
			}
			
		}
		
	}

	/**
	 * カートに商品を追加する
	 */
	private static void addItem(int operation) {
		// 操作を表示
		System.out.println(TARGET_TYPES[operation - 1] + "をカートに追加します");
		// 追加する商品を取得
		Item item = ItemFactory.create(operation);
		System.out.print("\t" + TARGET_TYPES[operation - 1] + "名を入力してください：");
		item.setName(scanner.next());
		if (item instanceof Book) {
			// 追加対象の商品が書籍の場合：書籍にキャスト
			System.out.print("\t" + "著者を入力してください：");
			((Book)item).setAuthor(scanner.next());
		}
		System.out.print("\t" + "価格を入力してください：");
		item.setPrice(scanner.nextInt());
		// 書籍をカートに追加
		cart.add(item);
		System.out.println();
	}

	/**
	 * カート内の商品を一覧表示する
	 */
	private static void showCart() {
		// 項目ヘッダの表示
		System.out.println("No." + "\t" + "商品情報");
		System.out.println("-------------------------");
		// カート内商品の表示
		for (int i = 0; i < cart.size(); i++) {
			System.out.print((i + 1) + "\t");
			cart.get(i).showInfo();
		}
		System.out.println("-------------------------");
		System.out.println();
	}

	/**
	 * 操作メニューを表示して、選択された操作インデックスを取得する
	 * @return 選択された操作インデックス
	 */
	private static int selectMenu() {
		// 操作メニューの表示
		System.out.println("1．商品追加");
		System.out.println("2．書籍追加");
		System.out.println("9．終了");
		// メニューインデックスの取得
		System.out.print("メニューを選択してください：");
		// 選択したメニュインデックスの取得
		int menu = scanner.nextInt();
		return menu;
	}
	
	/**
	 * 商品生成Factoryクラス
	 */
	private class ItemFactory {
		/**
		 * 指定された種別に応じたクラスを生成する
		 * @param type 種別
		 * @return 定義された種別が指定sれた場合は種別に応じたクラスのインスタンス、それ以外はnull
		 */
		public static Item create(int type) {
			Item target = null;
			switch (type) {
			case TYPE_ITEM:
				target = new Item();
				break;
			case TYPE_BOOK:
				target = new Book();
				break;
			}
			return target;
		}
	}
	
}
