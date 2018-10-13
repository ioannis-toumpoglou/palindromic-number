import java.util.Scanner;

public class PalindromicNumber {

	public static void main(String[] args) {
		
		System.out.print("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if (isPalindromic(number)) {
			System.out.println("The number is palindromic");
		} else {
			System.out.println("The number is not palindromic");
		}
		scan.close();
	}
	
	public static boolean isPalindromic(int number) {
		int reverse_number = reverseNumber(number);
		
		if (number == reverse_number) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int reverseNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			int digit = number%10;
			number /= 10;
			reverse = reverse*10+digit;
		}
		return reverse;
	}

}
