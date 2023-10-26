import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				
		int[] arr = new int[n];
		
		int num = 0;
		int user = 0;
		int result = 0;
		
		
		for (int i = 0; i < n; i++) {		
			num = sc.nextInt();
			arr[i] = num;
		}
		
		user = sc.nextInt();				
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == user) {
				result += 1;
			}
		}
		
		System.out.println(result);

	}

}
