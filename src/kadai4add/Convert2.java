package kadai4add;

/**
 * 追加課題JB41 Step-1
 * 	オーバーロードするメソッドから文字列を反転するメソッドを呼び出す例
 */
public class Convert2 {

	/**
	 * 整数を反転する
	 * @param input 処理対象整数
	 */
	public static void reverse(int input) {
		String target = Integer.toString(input);
		reverse(target);
	}

	/**
	 * 浮動小数点数を反転する：引数を文字列に変換して直接reverse（String）に渡している例
	 * @param input 処理対象浮動小数点数
	 */
	public static void reverse(double input) {
		reverse(Double.toString(input));
	}

	/**
	 * 文字列を反転する
	 * @param input 処理対象文字列
	 */
	public static void reverse(String target) {
		String reversed = "";
		for (int i = target.length(); i > 0; i--) {
			reversed += Character.toString(target.charAt(i - 1));
		}
		System.out.println(reversed);
	}

}
