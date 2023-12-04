import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		char[] arr = s1.toCharArray();
		
		int num = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if((num - 1) == i) {             //  num은 1부터 시작하지만 배열은 0부터 시작하니까
				System.out.println(arr[i]);  //  (입력값 -1)과 인덱스가 같다면 출력하기
			}	
		}
	}
}
