class Solution {
    static int solution(int n, int k) {
        int answer = 0;
        int yang = 12000;
        int drink = 2000;
        
        if(n>=10) {
        	int service = n/10;
        	answer = n*yang + (k*drink) - (service*drink);
        }
        else {
        	answer= n*yang + (k*drink);
        }
        return answer;
    }
}