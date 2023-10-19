import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int count = sc.nextInt();
		
		int sum = 0;		 
		
		for (int i = 0; i < count; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			sum = sum + n1 * n2;
	
		}
		
		if (sum == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
