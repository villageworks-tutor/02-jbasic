package kadai3add;

import java.util.Random;
import java.util.Scanner;

/**
 * 追加課題 JB31 Step-2
 * 	コンピュータがランダムに抽出した3桁の数字（数字は被らない）を当てるゲームを作成しなさい。
 * 	3桁のランダムな数字を返すメソッドと、ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字を比較するメソッドの2つのメソッドを作成し、利用しなさい。 
 */
public class Game21 {

	/**
	 * mainメソッドのみで完結するサンプル例
	 * 	メソッドを呼び出さないもっとも基本的なプログラミング例である。
	 * 	このようなソースコードからリファクタリングしてメソッドを外出しにする。
	 * 	このクラスを洗練することでGame2クラスを作成できればよい。
	 */
	public static void main(String[] args) {
		// 3桁の数字を生成：正答とする
		Random random = new Random();
		int answer = 0;
		// 3桁の数が発生するまで繰り返す：for(;;)文を利用する例
		for (;;) {
			answer = random.nextInt(1000);
			if (answer >= 100) break;
		}
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
				// 入力値と正答を比較
				int hit = 0;
				int blow = 0;
				// 比較用に正答と入力値をそれぞれ文字列に変換
				String answerString = Integer.toString(answer);
				String inputString = Integer.toString(input);
				// 入力値の文字数分のループ
				for (int i = 0; i < inputString.length(); i++ ) {
					if (inputString.charAt(i) == answerString.charAt(i)) {
						// 桁位置と文字がともに一致した場合：ヒットの条件
						hit++;
					} else if (!(answerString.indexOf(inputString.charAt(i)) == -1)) {
						// 桁位置は一致しないが文字が一致する場合：ブローの条件
						// else-if文を利用することにより桁位置の比較はを考慮不要である。
						// else-if文ではなくif文で判断する場合は桁位置が「一致しない」ことを判定する必要がある。
						blow++;
					}
				}
				// 判定結果を表示：表示内容はヒットカウントとブローカウント
				System.out.println(hit + "ヒット・" + blow + "ブロー");
				if (hit == 3 && blow == 0) {
					// 一致した場合：メッセージを表示してループを抜ける
					System.out.println(loop + "回で当たりました！");
					break;
				}
			}
		}
	}
}
