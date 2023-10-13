import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		
		int number1 = num1 * (num2 % 10);
	    System.out.println(number1);
		
	    int number2 = num1 * ((num2 % 100) / 10);
	    System.out.println(number2);
	
	    int number3 = num1 * (num2 / 100);
	    System.out.println(number3);

	    System.out.println(number1 + (number2 * 10) + (number3 * 100));
	}

}
