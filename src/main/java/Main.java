public class Main {
	public static void main(String[] args) {
		System.out.println("Part A: ");
		Digits digits = new Digits(15704);
		System.out.println(digits);
		digits = new Digits(0);
		System.out.println(digits);
		
		
		System.out.println("\nPart B: ");
		digits = new Digits(7);
		System.out.print(digits + " -> " + digits.isStrictlyIncreasing() + "\n");
		digits = new Digits(1356);
		System.out.print(digits + " -> " + digits.isStrictlyIncreasing() + "\n");
		digits = new Digits(1336);
		System.out.print(digits + " -> " + digits.isStrictlyIncreasing() + "\n");
		digits = new Digits(1536);
		System.out.print(digits + " -> " + digits.isStrictlyIncreasing() + "\n");
		digits = new Digits(65310);
		System.out.print(digits + " -> " + digits.isStrictlyIncreasing() + "\n");
		
	}
}
