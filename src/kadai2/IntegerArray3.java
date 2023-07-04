package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 7, 2, 7, 3};
		
		int counter = 0;
		for (int number : numbers) {
			if (number == 7) {
				counter++;
			}
		}
		
		System.out.println(counter + "個ありました");
	}

}
