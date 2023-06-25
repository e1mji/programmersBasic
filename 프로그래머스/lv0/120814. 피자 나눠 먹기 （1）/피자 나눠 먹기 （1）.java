class Solution {
	static int solution(int n) {
		// 피자 한판 = 7조각
		int pizzaSlice =7;
		int plate =0;
		int answer =0;
		for(int i =0; i<n; i++) {
			if(i % pizzaSlice ==0) {
				plate++;
			}
		}
		answer= plate;
		
		return answer;
	}
}