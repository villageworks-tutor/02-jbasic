package kadai3add;

import java.util.Random;
import java.util.Scanner;

/**
 * 追加課題 JB31 Step-1
 * 	コンピュータがランダムに抽出した数（0から99まで）を当てるゲームを作成しなさい。
 * 	0から99のランダムな数字を返すメソッドと、ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字の大小判定をするメソッドの2つのメソッドを作成し、
 * 	利用しなさい。 
 */
public class Game11 {

	/**
	 * mainメソッドのみで完結するサンプル例
	 * 	メソッドを呼び出さないもっとも基本的なプログラミング例である。
	 * 	このようなソースコードからリファクタリングしてメソッドを外出しにする。
	 * 	このクラスを洗練することでGame1クラスを作成できればよい。
	 */
	public static void main(String[] args) {
		// 0から99までの乱数を発生：正答とする
		Random random = new Random();
		int answer = random.nextInt(100);
		// ターミナルからの入力値を取得する準備
		try (Scanner scanner = new Scanner(System.in)) {
			// ループカウンタの初期化
			int loop = 0;
			// 入力値と正答が一致するまでループ
			while (true) {
				// ループ回数をインクリメント
				loop++;
				// ユーザから入力された数字を取得：入力値とする
				System.out.print("数字を入力してください：");
				int input = scanner.nextInt();
				// 入力値と正答を比較してメッセージを表示
				if (input > answer) {
					System.out.println("** 大きすぎです **");
				} else if (input < answer) {
					System.out.println("** 小さすぎます **");
				} else {
					System.out.println("** 当たりです **");
					// 入力値と正答が一致した場合はループを抜ける
					break;
				}
			}
			// 最終結果のメッセージを表示
			System.out.println(loop + "回で当たりました！");
		}
	}
}
