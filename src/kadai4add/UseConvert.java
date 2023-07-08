package kadai4add;

import java.util.Scanner;

/**
 * 追加課題JB41 Step-1
 * 	キーボードから入力したデータ（整数、浮動小数点数、文字列）を反転して表示するプログラムを作成しなさい。
 * 	UseConvert クラス（main メソッドを定義しているクラス）の実行結果が以下になるように Convert クラスを定義しなさい。
 */
public class UseConvert {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// 入力した整数を反転させる
			 System.out.print("整数を入力して下さい：");
			 int input1 = scanner.nextInt();
			 Convert2.reverse(input1);
			 
			 // 入力した浮動小数点数を反転させる
			 System.out.print("浮動小数点数を入力して下さい：");
			 double input2 = scanner.nextDouble();
			 Convert2.reverse(input2);
			 
			 // 入力した文字列を反転させる
			 System.out.print("文字列を入力して下さい："); 
			 String input3 = scanner.next();
			 Convert2.reverse(input3);
		}
	}

}
