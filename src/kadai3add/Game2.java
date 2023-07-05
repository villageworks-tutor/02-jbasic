package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		
		// 3桁の乱数の発生
		Random random = new Random();
		int seed = 0;
		for (;;) {
			seed = random.nextInt(999);
			if (seed >= 100) break;
		}
		
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力値と入力回数の初期化
			int input = 0;
			int loop = 0;
			
			while (true) {
				// 入力回数のカウント
				loop++;
				
				// ３桁の数字の入力の受付け
				System.out.print("3桁の数字を入力してください：");
				input = scanner.nextInt();
				
				// 乱数と入力値を文字列に変換
				String seedString = Integer.toString(seed);
				String inputString = Integer.toString(input);
				// 変換した文字列を１文字ずつの配列に格納
				String[] seeds = seedString.split("");
				String[] inputs = inputString.split("");
				
				// 乱数と入力値の比較
				int hit = 0;
				int blow = 0;
				for (int i = 0; i < seeds.length; i++) {
					// 数字とその位置が一致した場合：hitをインクリメント
					if (seeds[i].equals(inputs[i])) hit++;
					// 入力値の文字配列を走査
					for (int j = 0; j < inputs.length; ++j) {
						// 乱数と入力値の数字が一致するが桁位置が異なる場合：blowをインクリメント
						if (seeds[i].equals(inputs[j]) && i != j) blow++;
					}
				}
				
				// 比較結果を表示
				System.out.println("ヒット：" + hit + "、ブロー：" + blow);
				
				// 終了条件に合致した場合：hitが3、blowが0であれば終了
				if (hit == 3 && blow == 0) {
					System.out.println(loop + "回で当たりました！");
					break;
				}
			}
		}
	}
}
