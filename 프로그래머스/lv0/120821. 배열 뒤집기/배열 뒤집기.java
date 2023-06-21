class Solution {
     static int[] solution(int[] num_list) {

        int[] answer = new int [num_list.length];

        int index = 0;
       
        for(int i =num_list.length-1; i>=0; i--) {

        	if(num_list[i] < num_list[i]+1) {

        		answer[index++]=num_list[i];
        	}
        }
        return answer;
    }
}