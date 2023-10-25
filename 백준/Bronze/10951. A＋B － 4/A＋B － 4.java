import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNextLine()) {
			
			String str = sc.nextLine();
			if(str.contains(" ")) {
				String[] arr = str.split(" ");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				System.out.println(a + b);
			}
			else {
				break;
			}
			}
		sc.close();
	}
}
