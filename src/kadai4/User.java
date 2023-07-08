/**
 * 課題JB40 Step-4
 * 	User（会員）クラスを作成しなさい。
 */
package kadai4;

public class User {
	// フィールド（名前と年齢）
	String name;
	int age;
	// 情報を出力するshowInfo()メソッド
	public void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}
