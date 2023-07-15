package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 追加課題JB71 Step-1
 * 	mainメソッドと各種メソッドとの共働版
 */
public class _CartSystem13 {
	
	/**
	 * クラス定数
	 */
	private static final int OPE_ADD_ITEM = 1;
	private static final int OPE_ADD_BOOK = 2;
	private static final int OPE_QUIT     = 9;
	
	
	// 商品情報保存リスト（フィールド）
	private static List<Item> cart = new ArrayList<Item>(); 
	// スキャナークラス（フィールド） 
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		while (true) {
			// 操作メニューから操作を選択
			int operation = selectMenu();
			
			// メニューインデックスによる操作の分岐
			switch (operation) {
			case OPE_ADD_ITEM:
			case OPE_ADD_BOOK:
				// 追加する書籍を取得
				addItem(operation);
				break;
			case OPE_QUIT:
				// 終了の場合（課題に指示はない）
				System.out.println();
				System.out.println("プログラムを終了します");
				return;
			default:
				System.out.println();
				break;
			}
		}
	}

	/**
	 * 商品を追加する
	 * @param operation 操作メニューインデックス（1：商品追加　2：書籍追加）
	 */
	private static void addItem(int operation) {
		// 対象商品の種別定数配列
		final String[] TARGET_TYPES = new String[] {"商品", "書籍"}; 
		
		// 操作によって対象商品のインスタンス化を切り替え
		Item target = null;
		String type = "";
		if (operation == OPE_ADD_ITEM) {
			target = new Item();
		} else if (operation == OPE_ADD_BOOK) {
			target = new Book();
		}
		// 追加操作のメッセージを表示
		System.out.println(TARGET_TYPES[operation-1] + "をカートに追加します");
		// 商品名または書籍名の取得
		System.out.print("\t" + TARGET_TYPES[operation-1] + "名を入力してください：");
		target.setName(scanner.next());
		// 処液の場合は著者の取得
		if (operation == OPE_ADD_BOOK) {
			System.out.print("\t" + "著者を入力してください：");
			((Book)target).setAuthor(scanner.next());
		}
		// 価格の取得
		System.out.print("\t" + "価格を入力してください：");
		target.setPrice(scanner.nextInt());
		
		// 商品をカートに追加
		cart.add(target);
		System.out.println();
		
		// カート内商品の一覧表示
		showCart();
	}

	/**
	 * カート内の商品の一覧を表示する
	 */
	private static void showCart() {
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
	 * 操作メニューを選択する
	 * @return 選択された操作メニューのインデックス
	 */
	private static int selectMenu() {
		System.out.println("1．商品追加");
		System.out.println("2．書籍追加");
		System.out.println("9．終了");
		System.out.print("メニューを選択してください：");
		int operation = scanner.nextInt();
		return operation;
	}
}
