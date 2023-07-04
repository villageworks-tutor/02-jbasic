package kadai2;

public class Introduce1 {

	public static void main(String[] args) {
		String[] hobby = {"ダンス", "映画", "バイク"};
		
		System.out.println("私の趣味は");
		for (int i = 0; i < hobby.length; i++) {
			System.out.println("・" + hobby[i]);
		}
		System.out.println("です");
	}

}
