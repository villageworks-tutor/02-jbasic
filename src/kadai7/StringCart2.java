package kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 課題JB70 Step-3
 * 	キーボードから取得した商品を３回リストに追加し、拡張for文を利用して出力しなさい。
 * 	キーボードからの商品を３回リストに追加するときにもfor文を利用します。
 */
public class StringCart2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 文字列を保持できるリストの作成
			List<String> items = new ArrayList<String>();
			
			// キーボードからリストに追加するを3回繰り返す
			for (int i = 0; i < 3; i++) {
				System.out.print("商品を追加してください：");
				items.add(scanner.next());
			}
			// 拡張for文を利用して全商品を出力する
			for (String item : items) {
				System.out.println(item);
			}
		}
	}

}
