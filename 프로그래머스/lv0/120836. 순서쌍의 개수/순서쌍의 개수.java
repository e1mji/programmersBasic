class Solution {
    static int solution(int n) {
		int answer = 0;
		int count =0;
		for(int i =1; i*i<=n; i++) {
			if(n%i==0) {
				if(i*i == n) {
					count += 1;
				}else {
					count+=2;
				}		
			}
		}
		answer = count;
		return answer;
	}
}