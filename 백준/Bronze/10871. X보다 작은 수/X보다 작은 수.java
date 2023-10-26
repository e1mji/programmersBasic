import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				
		int[] a = new int[n];
		
		int x = sc.nextInt();				
		
		
		int num = 0;
		for (int i = 0; i < n; i++) {		
			num = sc.nextInt();
			a[i] = num;
		}
	
		
		for (int j = 0; j < a.length; j++) {		
			if (a[j] < x) {
				result += a[j] + " ";
			}
			
		}
		System.out.println(result);
		
		
	}

}
