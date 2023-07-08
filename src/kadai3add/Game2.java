package kadai3add;

import java.util.Random;
import java.util.Scanner;

/**
 * 追加課題 JB31 Step-2
 * 	コンピュータがランダムに抽出した3桁の数字（数字は被らない）を当てるゲームを作成しなさい。
 * 	3桁のランダムな数字を返すメソッドと、ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字を比較するメソッドの2つのメソッドを作成し、利用しなさい。 
 */
public class Game2 {

	/**
	 * mainメソッドから他のメソッドを呼び出して処理を実行するサンプル例
	 */
	public static void main(String[] args) {
		// 3桁の数字を生成：正答とする
		int answer = genRandom();
		answer = 975;
		// ターミナルからの入力値を取得する準備
		try (Scanner scanner = new Scanner(System.in)) {
			// ループカウンタの初期化
			int loop = 0;
			// 入力値がと正答が条件を満たすまでループ
			while (true) {
				loop++;
				// ユーザからの入力値を取得
				System.out.print("3桁の数字を入力してください：");
				int input = scanner.nextInt();
				// 比較用に正答と入力値をそれぞれ文字列に変換
				if (isMatched(input, answer)) {
					// 一致した場合：メッセージを表示してループを抜ける
					System.out.println(loop + "回で当たりました！");
					break;
				}
			}
		}
	}

	/**
	 * ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字を比較する
	 * @param subject キーボードから入力した数字
	 * @param object  ランダムな数字
	 * @return 入力値と正答が一致した場合はtrue、それ以外はfalse
	 */
	static boolean isMatched(int subject, int object) {
		// 戻り値の初期化：一致した場合の値で初期化（一致しなかった場合に戻り値を書き換える）
		boolean isMatched = true;
		// 引数を文字列に変換
		String subjectString = Integer.toString(subject);
		String objectString = Integer.toString(object);
		// ヒットカウンタとブローカウンタの初期化
		int hit = 0;
		int blow = 0;
		// 入力値の文字数分のループ
		for (int i = 0; i < subjectString.length(); i++) {
			if (subjectString.charAt(i) == objectString.charAt(i)) {
				// 桁位置と文字がともに一致した場合：ヒットの条件
				hit++;
			} else if (!(subjectString.indexOf(objectString.charAt(i)) == -1)) {
				// 桁位置は一致しないが文字が一致する場合：ブローの条件
				blow++;
			}
		}
		// ヒットとブローのカウント結果を表示
		System.out.println(hit + "ヒット・" + blow + "ブロー");
		// 一致しなかった場合：戻り値をfalseに書換え（一致の条件は「3ヒット・0ブロー」）
		if (!(hit == 3 && blow == 0)) isMatched = false;
		// 戻り値を返却
		return isMatched;
	}

	/**
	 * 3桁のランダムな数字を返す
	 * @return 3桁のランダムな数字
	 */
	static int genRandom() {
		Random random = new Random();
		for (;;) {
			int number = random.nextInt(1000);
			// ３桁なので100以上であれば返却して終了
			if (number >= 100) return number;
			
		}
	}
}
