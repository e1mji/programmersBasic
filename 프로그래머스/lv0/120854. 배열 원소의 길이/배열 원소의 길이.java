class Solution {
    static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i =0; i<strlist.length; i++) {
        	// strlist의 i요소의 길이를 answer[i]요소에 담기.
        	answer[i] = strlist[i].length();
        }
        return answer;
    }
}