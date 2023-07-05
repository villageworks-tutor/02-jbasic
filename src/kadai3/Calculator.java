package kadai3;

public class Calculator {

	public static void main(String[] args) {
		// Step1
		int a = add(3, 7);
		System.out.println(a);
		
		int b = sub(3, 7);
		System.out.println(b);
		
		// Step2
		int c = add(3, 7, 10);
		System.out.println(c);
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
