package kadai4add;

/**
 * 追加課題JB41 Step-1
 * 	単純にオーバーロードするソースコード例
 */
public class Convert {

	/**
	 * 整数を反転する
	 * @param input 処理対象整数
	 */
	public static void reverse(int input) {
		String target = Integer.toString(input);
		String reversed = "";
		for (int i = target.length(); i > 0; i--) {
			reversed += Character.toString(target.charAt(i - 1));
		}
		System.out.println(reversed);
	}

	/**
	 * 浮動小数点数を反転する
	 * @param input 処理対象浮動小数点数
	 */
	public static void reverse(double input) {
		String target = Double.toString(input);
		String reversed = "";
		for (int i = target.length(); i > 0; i--) {
			reversed += Character.toString(target.charAt(i - 1));
		}
		System.out.println(reversed);
	}

	/**
	 * 文字列を反転する
	 * @param input 処理対象文字列
	 */
	public static void reverse(String input) {
		String reversed = "";
		for (int i = input.length(); i > 0; i--) {
			reversed += Character.toString(input.charAt(i - 1));
		}
		System.out.println(reversed);
	}

}
