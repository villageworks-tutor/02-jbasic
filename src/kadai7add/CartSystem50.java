package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 追加課題JB71 Step-5
 * 	ver.50 mainメソッドのみの完結版：最低限クリアしてほしいバージョン
 */
public class CartSystem50 {
	
	// 商品情報保存リスト（フィールド）
	private static List<Item> cart = new ArrayList<Item>(); 
	// スキャナークラス（フィールド） 
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		while (true) {
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
			int operation = scanner.nextInt();
			
			// メニューインデックスによる操作の分岐
			switch (operation) {
			case 1:
				// 追加する商品を取得
				Item item = new Item();
				System.out.println("商品をカートに追加します");
				System.out.print("\t" + "商品名を入力してください：");
				item.setName(scanner.next());
				System.out.print("\t" + "価格を入力してください：");
				item.setPrice(scanner.nextInt());
				// 商品をカートに追加
				cart.add(item);
				System.out.println();
				// カートの商品一覧を表示
				System.out.println("No." + "\t" + "商品情報");
				System.out.println("-------------------------");
				for (int i = 0; i < cart.size(); i++) {
					System.out.print((i + 1) + "\t");
					cart.get(i).showInfo();
				}
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 2:
				// 追加する書籍を取得
				Book book = new Book();
				System.out.println("書籍をカートに追加します");
				System.out.print("\t" + "書籍名を入力してください：");
				book.setName(scanner.next());
				System.out.print("\t" + "著者を入力してください：");
				book.setAuthor(scanner.next());
				System.out.print("\t" + "価格を入力してください：");
				book.setPrice(scanner.nextInt());
				// 書籍をカートに追加
				cart.add(book);
				System.out.println();
				// カートの商品一覧を表示
				System.out.println("No." + "\t" + "商品情報");
				System.out.println("-------------------------");
				for (int i = 0; i < cart.size(); i++) {
					System.out.print((i + 1) + "\t");
					cart.get(i).showInfo();
				}
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 3:
				System.out.println("情報を更新します");
				System.out.print("\t" + "No.を入力してください：");
				int no = scanner.nextInt();
				
				Item target = null;
				
				for (int i = 0; i < cart.size(); i++) {
					if (i + 1 == no) {
						target = cart.get(i);
						break;
					}
				}
				
				if (target == null) {
					System.out.println("選択されたNo.はありません");
					System.out.println();
				} else if (target instanceof Book) {
					System.out.print("書籍名を入力してください（現在：" + target.getName() + "）：");
					target.setName(scanner.next());
					System.out.print("著者を入力してください（現在：" + ((Book)target).getAuthor() + "）：");
					((Book)target).setAuthor(scanner.next());
					System.out.print("価格を入力してください（現在：" + target.getPrice() + "）：");
					target.setPrice(scanner.nextInt());
				} else {
					System.out.print("商品名を入力してください（現在：" + target.getName() + "）：");
					target.setName(scanner.next());
					System.out.print("価格を入力してください（現在：" + target.getPrice() + "）：");
					target.setPrice(scanner.nextInt());
				}
				// カートの商品一覧を表示
				System.out.println("No." + "\t" + "商品情報");
				System.out.println("-------------------------");
				for (int i = 0; i < cart.size(); i++) {
					System.out.print((i + 1) + "\t");
					cart.get(i).showInfo();
				}
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 4:
				System.out.println("カートから削除します");
				System.out.print("\t" + "No.を入力してください：");
				int delNo = scanner.nextInt();
				if (delNo > cart.size()) {
					System.out.println("\t" + "選択されたNo.はありません");
				} else {
					cart.remove(delNo - 1);
				}
				System.out.println();
				
				// カートの商品一覧を表示
				System.out.println("No." + "\t" + "商品情報");
				System.out.println("-------------------------");
				for (int i = 0; i < cart.size(); i++) {
					System.out.print((i + 1) + "\t");
					cart.get(i).showInfo();
				}
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 5:
				System.out.println("カートを検索します");
				System.out.print("\t" + "検索キーワードを入力してください：");
				String keyword = scanner.next();
				
				// 検索の実行
				List<Item> results = new ArrayList<Item>();
				for (Item subject : cart) {
					if (subject instanceof Book) {
						// 書籍のインスタンス場合
						if (subject.getName().indexOf(keyword) > -1 || ((Book)subject).getAuthor().indexOf(keyword) > -1) {
							results.add(subject);
						}
					} else if (subject instanceof Item) {
						// 商品のインスタンス場合
						if (subject.getName().indexOf(keyword) > -1) {
							results.add(subject);
						}
					}
				}
				
				// 検索結果の表示
				System.out.println("商品情報");
				System.out.println("-------------------------");
				for (Item result : results) {
					result.showInfo();
				}
				System.out.println("-------------------------");
				System.out.println();
				break;
			case 6:
				System.out.println("カートを検索します");
				// カート内の商品の愚形金額を計算
				int total = 0;
				for (Item goods : cart) {
					total += goods.getPrice();
				}
				System.out.println("\t" + "＊＊＊ 合計金額は" + total + "円です ＊＊＊");
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
				break;
			case 9:
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

}
