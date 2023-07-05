package kadai3;

public class IntriduceMethod {

	public static void main(String[] args) {
		introduce("田中一郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);
	}
	
	static void introduce(String name, int age) {
		System.out.println(name + age + "歳です");
		System.out.println("１０年後は" + (age + 10) + "歳です");
	}

}
