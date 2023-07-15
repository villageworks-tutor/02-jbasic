package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 追加課題JB71 Step-2
 * 	ver.20 mainメソッドのみの完結版：最低限クリアしてほしいバージョン
 */
public class CartSystem20 {
	
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
