import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		알고리즘 수업 - 알고리즘의 수행 시간 2

//		문제
//
//		입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
//
//		MenOfPassion 알고리즘은 다음과 같다.
//
//		MenOfPassion(A[], n) {
//		    sum <- 0;
//		    for i <- 1 to n    
//		        sum <- sum + A[i]; # 코드1
//		    return sum;
//		}
//		입력
//		첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
//
//		출력
//		첫째 줄에 코드1 의 수행 횟수를 출력한다.
//
//		둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다.
//        단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
//
//		예제 입력 1 
//		7
//		예제 출력 1 
//		7
//		1
		
		Scanner sc = new Scanner(System.in);
		
        //  반복문은 1부터 n까지 수행
		//	입력값 n 에 따라서 실행횟수가 달라진다
		int num = sc.nextInt();
		
		System.out.println(num);
		System.out.print(1);
		
		
	}

}
