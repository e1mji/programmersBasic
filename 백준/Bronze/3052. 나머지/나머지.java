import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		boolean[] arr = new boolean[42];		//	나머지가 나올 수 있는 경우의 수는 0 ~ 42
		
		for(int i = 0; i < 10; i++) {			
			arr[Integer.parseInt(sc.nextLine()) % 42] = true;		//	입력값 % 42 를 index로 지정. 
																	//	해당 인덱스에는 값이 들어있다는 의미로 true로 넣어줌 (원래 기본은 false니까)
		}															//	이 방법은 중복되는 값도 처리 가능. 어차피 같은 인덱스 자리에 계속 true 를 넣어주는 것이기 때문 
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}