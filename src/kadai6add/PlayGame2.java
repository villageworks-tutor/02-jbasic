package kadai6add;

import java.util.Scanner;

/**
 * 追加課題JB61 Step-3
 * 	Humanクラス（Step1で作成済み）とWarriorクラス（Step2で作成済み）を利用し、以下の出力結果になるようにPlayGameクラス（mainメソッドを定義しているクラス）を作成しなさい。
 */
public class PlayGame2 {

	/**
	 * クラス定数
	 */
	private static final int PARTY_MEMBERS_COUNT = 3;
	private static final int OPE_LIST = 1;
	private static final int OPE_ATTACK = 2;
	private static final int OPE_QUIT = 9;
	private static final int TYPE_OF_HUMAN = 1;
	private static final int TYPE_OF_WARRIOR = 2;
	
	/**
	 * mainメソッドから各メソッドを呼び出すコードの例：クラス定数も導入
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// パーティの作成
			Human[] party = createParty(PARTY_MEMBERS_COUNT, scanner);
			
			// 選択した操作の実行
			// 選択された操作インデックスを格納する変数の初期化
			int operation = 0;
			while (!((operation = selectOperation(scanner)) == OPE_QUIT)) {
				switch (operation) {
				case OPE_LIST:
					showMembers(party);
					break;
				case OPE_ATTACK:
					attacks(party);
					break;
				default:
					break;
				}
			}
			// ゲーム終了のメッセージをヒュおじ
			showQuitMessage();
		}
	}

	/**
	 * ゲーム終了のメッセージを表示する
	 */
	static void showQuitMessage() {
		System.out.println();
		System.out.println("ゲームは終了した");
	}

	/**
	 * パーティのメンバーが攻撃する
	 * @param party パーティ
	 */
	static void attacks(Human[] party) {
		for (Human member : party) {
			member.attack();
		}
	}

	/**
	 * パーティのメンバーの情報を表示する
	 * @param party パーティ
	 */
	static void showMembers(Human[] party) {
		for (Human member : party) {
			member.info();
		}
	}

	/**
	 * パーティを作成する
	 * @param count パーティメンバーの人数
	 * @param scanner Scannerオブジェクト
	 * @return パーティ（HumanクラスまたはHumanクラスの継承クラスのインデックスを要素とする配列）
	 */
	static Human[] createParty(int count, Scanner scanner) {
		System.out.println("=== パーティを作成します ===");
		Human[] party = new Human[count];
		for (int i = 0; i < party.length; i++) {
			System.out.print("どちら（1：市民　2：戦士）を作成しますか：");
			int type = scanner.nextInt();
			party[i] = createMember(type, scanner);
		}
		System.out.println("=== パーティを作成しました ===");
		return party;
	}

	/**
	 * パーティのメンバーを生成する
	 * @param type メンバーの種別
	 * @param scanner Scannerオブジェクト
	 * @return 種別が1である場合はHumanクラスのインスタンス、種別が2である場合はWarriorクラスのインスタンス、定義されていない種別の場合はnull
	 */
	static Human createMember(int type, Scanner scanner) {
		Human member = null;
		switch (type) {
		case TYPE_OF_HUMAN:
			member = createHuman(scanner);
			break;
		case TYPE_OF_WARRIOR:
			member = createWarrior(scanner);
			break;
		default:
			break;
		}
		return member;
	}

	/**
	 * Warriorクラスを生成する
	 * @param scanner Scannerオブジェクト
	 * @return Warriorクラスのインスタンス
	 */
	static Human createWarrior(Scanner scanner) {
		System.out.print("名前：");
		String name = scanner.next();
		System.out.print("種別：");
		String type = scanner.next();
		return new Warrior(name, type);
	}

	/**
	 * Humanクラスを生成する
	 * @param scanner Scannerオブジェクト
	 * @return Humanクラスのインスタンス
	 */
	static Human createHuman(Scanner scanner) {
		System.out.print("名前：");
		String name = scanner.next();
		return new Human(name);
	}

	/**
	 * 操作を選択する
	 * @param scanner Scannerオブジェクト
	 * @return 操作インデックス
	 */
	static int selectOperation(Scanner scanner) {
		System.out.println();
		System.out.print("操作（1：一覧表示　2：攻撃　9：終了）を選択してください：");
		return scanner.nextInt();
	}

}
