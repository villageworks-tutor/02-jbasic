package kadai6add;

import java.util.Scanner;

/**
 * 【応用】パーティのメンバーを生成するFactoryクラス
 * TODO: メソッドの引数にScannerオブジェクトが含まれていることは疎結合の原則の観点からは要検討
 */
public class MemberFactory {

	/**
	 * クラス定数
	 */
	private static final int TYPE_OF_HUMAN = 1;
	private static final int TYPE_OF_WARRIOR = 2;

	/**
	 * 種別に対応したHumanクラスのインスタンスまたはHumanクラスの継承クラスのインスタンスを生成する
	 * @param type 種別
	 * @param scanner Scannerオブジェクト
	 * @return 種別が「市民」の場合はHumanクラスのインスタンス、種別が「戦士」の場合はWarriorクラスのインスタンス、それ以外はnull
	 */
	public static Human create(int type, Scanner scanner) {
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


}
