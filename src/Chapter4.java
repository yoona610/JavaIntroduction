
public class Chapter4 {
	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (input == i) {
				System.out.println("アタリ");
			}
		}
	}
}
