package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 7, 2, 7, 3};
		
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		
		System.out.println("合計：" + total);
	}

}
