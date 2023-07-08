package kadai3add;

import java.util.Random;
import java.util.Scanner;

/**
 * 追加課題 JB31 Step-1
 * 	コンピュータがランダムに抽出した数（0から99まで）を当てるゲームを作成しなさい。
 * 	0から99のランダムな数字を返すメソッドと、ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字の大小判定をするメソッドの2つのメソッドを作成し、
 * 	利用しなさい。 
 */
public class Game1 {

	/**
	 * mainメソッドから他のメソッドを呼び出して処理を実行するサンプル例
	 */
	public static void main(String[] args) {
		// 0から99までの乱数を発生：正答とする
		int answer = genRandom();
		// ターミナルからの入力値を取得する準備
		try (Scanner scanner = new Scanner(System.in)) {
			// ループカウンタの初期化
			int loop = 0;
			// 入力値が正答と一致するまでループ
			while (true) {
				// ループ回数をインクリメント
				loop++;
				// ユーザから入力された数字を取得：入力値とする
				System.out.print("数字を入力してください：");
				int input = scanner.nextInt();
				// 入力値と正答を比較：等しい場合（比較結果がtrue）はループを抜ける
				if (isMateched(input, answer)) break;
			}
			// 最終結果のメッセージを表示
			System.out.println(loop + "回で当たりました！");
		}
	}

	/**
	 * ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字の大小判定をする
	 * @param subject キーボードから入力した数字
	 * @param object  ランダムな数字
	 * @return 入力値と正答が一致した場合はtrue、それ以外はfalse
	 */
	static boolean isMateched(int subject, int object) {
		// 戻り値の初期化：一致した場合の値で初期化（一致しなかった場合にfalseに書き換える）
		boolean isMatche = true;
		// 表示メッセージの初期化
		String message = "";
		if (subject == object) {
			// 一致した場合
			message = "** 当たりです **";
		} else {
			// 一致しなかった場合：戻り値をfalseに書き換え
			isMatche = false;
			if (subject > object) {
				message = "** 大きすぎます **";
			} else {
				message = "** 小さすぎます **";
			}
		}
		// 比較結果のメッセージを表示して結果を返却
		System.out.println(message);
		return isMatche;
	}

	/**
	 * 0から99のランダムな数字を返す
	 * @return 0から99までの乱数
	 */
	static int genRandom() {
		Random random = new Random();
		int number = random.nextInt(100);
		return number;
	}
}
