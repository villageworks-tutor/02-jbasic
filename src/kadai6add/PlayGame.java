package kadai6add;

import java.util.Scanner;

/**
 * 追加課題JB61 Step-3
 * 	Humanクラス（Step1で作成済み）とWarriorクラス（Step2で作成済み）を利用し、以下の出力結果になるようにPlayGameクラス（mainメソッドを定義しているクラス）を作成しなさい。
 */
public class PlayGame {

	/**
	 * mainメソッドで完結するコード例
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// パーティの作成
			Human[] party = new Human[3];
			System.out.println("=== パーティを作成します ===");
			for (int i = 0; i < party.length; i++) {
				// 作成対象の入力値を取得
				System.out.print("どちら（1：市民　2：戦士）を作成しますか：");
				int target = scanner.nextInt();
				// 入力値によって作成対象を分岐
				if (target == 1) {
					// 市民を作成する場合
					System.out.print("名前：");
					String name = scanner.next();
					party[i] = new Human(name);
				} else if (target == 2) {
					// 戦士を作成する場合
					System.out.print("名前：");
					String name = scanner.next();
					System.out.print("種別：");
					String type = scanner.next();
					party[i] = new Warrior(name, type);
				}
			}
			System.out.println("=== パーティを作成しました ===");
			
			// 選択した操作の実行
			while (true) {
				System.out.println();
				System.out.print("操作（1：一覧表示　2：攻撃　9：終了）を選択してください：");
				int operation = scanner.nextInt();
				
				if (operation == 1) {
					for (Human member : party) {
						member.info();
					}
				} else if (operation == 2) {
					for (Human member : party) {
						member.attack();
					}
				} else {
					break;
				}
			}
			// ゲームの終了
			System.out.println();
			System.out.println("ゲームは終了した");
		}
	}

}
