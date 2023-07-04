package kadai1;

import java.util.Random;

public class CheckRandom {

	public static void main(String[] args) {
		
		// 乱数の発生
		Random random = new Random();
		int rand = random.nextInt(3);
		
		// 発生した乱数の判定
		String hand = "";
		switch (rand) {
		case 0:
			hand = "グー";
			break;
		case 1:
			hand = "チョキ";
			break;
		case 2:
			hand = "パー";
			break;
		}
		
		// 判定結果の表示
		System.out.println(hand);
		
	}

}
