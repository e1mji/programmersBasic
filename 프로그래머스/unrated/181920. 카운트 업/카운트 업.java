class Solution {
   public static int[] solution(int start_num, int end_num) {
		 int size = end_num - start_num+1;
		 int[] answer = new int[size];
	        // answer의 길이가 ? 10-3 = 7;
	        for(int i =0 ; i<size; i++){
	            	answer[i] = start_num++;
	            	System.out.println(answer[i]);
	        }
	        //i가 3 i가 10까지포함해서 i를 증가시키면서 
	        //answer
	        return answer;
	    }
}