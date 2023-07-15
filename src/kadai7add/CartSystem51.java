package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 追加課題JB71 Step-5
 * 	ver.51 メソッド分割版：ver41に購入メソッドを追加
 * 	ver.50 mainメソッドのみの完結版：最低限クリアしてほしいバージョン
 */
public class CartSystem51 {
	
	/**
	 * クラス定数
	 */
	// 操作インデックス定数群
	private static final int OPE_ADD_ITEM        = 1;
	private static final int OPE_ADD_BOOK        = 2;
	private static final int OPE_UPDATE          = 3;
	private static final int OPE_DELETE          = 4;
	private static final int OPE_FIND_BY_KEYWORD = 5;
	private static final int OPE_ORDER           = 6;
	private static final int OPE_QUIT            = 9;
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
			case OPE_UPDATE:
				// カート内商品の情報を更新
				updateItem();
				// カートの商品一覧を表示
				showCart();
				break;
			case OPE_DELETE:
				// カート内商品を削除
				removeItem();
				// カートの商品一覧を表示
				showCart();
				break;
			case OPE_FIND_BY_KEYWORD:
				// キーワードによる検索
				findByKeyword();
				break;
			case OPE_ORDER:
				// 購入処理
				order();
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
	 * 購入処理を実行する
	 */
	private static void order() {
		// 操作を表示
		System.out.println("カートを検索します");
		// カート内の商品の愚形金額を計算
		int total = 0;
		for (Item goods : cart) {
			total += goods.getPrice();
		}
		// 計算結果を表示
		System.out.println("\t" + "＊＊＊ 合計金額は" + total + "円です ＊＊＊");
		System.out.println();
		// カートの初期化
		cart = new ArrayList<Item>();
		// カート内商品の一覧の表示
		System.out.println("No." + "\t" + "商品情報");
		System.out.println("-------------------------");
		for (int i = 0; i < cart.size(); i++) {
			System.out.print((i + 1) + "\t");
			cart.get(i).showInfo();
		}
		System.out.println("-------------------------");
		System.out.println();
	}

	/**
	 * カート内の商品をキーワード検索する
	 */
	private static void findByKeyword() {
		// 操作を表示
		showMessage("カートを検索します");
		// 削除する商品番号を取得
		String keyword = getInputString("検索キーワードを入力してください");
		
		// 検索の実行
		List<Item> results = new ArrayList<Item>();
		for (Item item : cart) {
			if (item instanceof Book) {
				// 書籍のインスタンス場合
				if (item.getName().contains(keyword) || ((Book)item).getAuthor().contains(keyword)) {
					results.add(item);
				}
			} else if (item instanceof Item) {
				// 商品のインスタンスの場合
				if (item.getName().contains(keyword)) {
					results.add(item);
				}
			}
		}
		
		// 検索結果の表示
		System.out.println("商品情報");
		System.out.println("-------------------------");
		for (Item item : results) {
			item.showInfo();
		}
		System.out.println("-------------------------");
		System.out.println();
		
	}

	/**
	 * カート内商品を削除する
	 */
	private static void removeItem() {
		// 操作を表示
		showMessage("カートから削除します");
		// 削除する商品番号を取得
		int no = getInputInt("No.を入力してください");
		// 商品番号によって処理を分岐
		if (no > cart.size()) {
			showMessageln("\t" + "選択されたNo.はありません");
		} else {
			cart.remove(no - 1);
		}
		System.out.println();
	}

	/**
	 * カート内商品の情報を更新する
	 */
	private static void updateItem() {
		// 操作を表示
		showMessage("情報を更新します");
		// 更新する商品を取得
		int no = getInputInt("No.を入力してください：");
		Item target = getItem(no);
		// 商品のインスタンスによって処理を分岐
		if (target == null) {
			showMessageln("\t" + "選択されたNo.はありません");
		} else if (target instanceof Book) {
			target.setName(getInputString("書籍名を入力してください（現在：" + target.getName() + "）"));
			((Book)target).setAuthor(getInputString("著者を入力してください（現在：" + ((Book)target).getAuthor() + "）"));
			target.setPrice(getInputInt("価格を入力してください（現在：" + target.getPrice() + ")"));
		} else {
			target.setName(getInputString("商品名を入力してください（現在：" + target.getName() + "）"));
			target.setPrice(getInputInt("価格を入力してください（現在：" + target.getPrice() + ")"));
		}
		System.out.println();
	}

	/**
	 * 指定された番号のカート内商品を取得する
	 * @param no カート内商品の番号
	 * @return 番号がカート内の商品数以下である場合は商品クラスのインスタンス、それ以外はnull
	 */
	private static Item getItem(int no) {
		if (no > cart.size()) {
			return null;
		} else {
			return cart.get(no - 1);
		}
		
	}

	/**
	 * カートに商品を追加する
	 */
	private static void addItem(int operation) {
		// 操作を表示
		showMessage(TARGET_TYPES[operation - 1] + "をカートに追加します");
		// 追加する商品を取得
		Item item = ItemFactory.create(operation);
		item.setName(getInputString(TARGET_TYPES[operation - 1] + "名を入力してください"));
		if (item instanceof Book) {
			// 追加対象の商品が書籍の場合：書籍にキャスト
			((Book)item).setAuthor(getInputString("著者を入力してください"));
		}
		item.setPrice(getInputInt("価格を入力してください"));
		// 書籍をカートに追加
		cart.add(item);
		System.out.println();
	}

	/**
	 * 整数の入力を促す
	 * @param message 表示メッセージ
	 * @return 入力された整数
	 */
	private static int getInputInt(String message) {
		String input = getInputString(message);
		return Integer.parseInt(input);
	}

	/**
	 * 文字列の入力を促す
	 * @param message 表示メッセージ
	 * @return 入力された文字列
	 */
	private static String getInputString(String message) {
		System.out.print("\t" + message + "：");
		return scanner.next();
	}

	/**
	 * メッセージを表示する
	 * @param message 表示するメッセージ
	 */
	private static void showMessage(String message) {
		System.out.println(message);
	}
	
	/**
	 * 「メッセージ＋空行」を表示する
	 * @param message 表示するメッセージ
	 */
	private static void showMessageln(String message) {
		System.out.println(message);
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
		System.out.println("3.情報更新");
		System.out.println("4.カートから削除");
		System.out.println("5.カートを検索");
		System.out.println("6.購入");
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
