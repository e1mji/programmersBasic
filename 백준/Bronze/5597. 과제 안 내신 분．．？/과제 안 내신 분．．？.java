import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		int[] arr = new int[31];							//	출석번호는 1부터 시작하니까 			
		
		for(int i = 1; i < 29; i++) {						//	입력은 1 ~ 28까지 
			int num = Integer.parseInt(sc.nextLine());		//	입력시 공백을 처리할 수 있게 Integer.parseInt
			arr[num] = 1;									//	(입력값)번째의 자리에다가 1을 넣기 
		}
		for(int i = 1; i < arr.length; i++) {				//	값이 비어진 2개의 칸도 함께 반복문 돌려야한다 
			if(arr[i] != 1) {								//	1이 들어가있지않다면 (== 입력되지 않은 값)
				System.out.println(i);						//	출력 
			}
		}
	}
}