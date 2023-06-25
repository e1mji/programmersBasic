import java.util.HashMap;

class Solution {
    static int[] solution(int n, String[] words) {
	        int[] answer = {0 ,0};
	        HashMap<String, Integer> sMap = new HashMap<String, Integer>();
	        sMap.put(words[0], 0);

	        for(int i = 1; i < words.length; ++i) {
	            sMap.put(words[i], 0);

	            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
	                || sMap.size() < i + 1) {
	                answer[0] = i % n + 1;
	                answer[1] = i / n + 1;
	                break;
	            }
	        }

	        return answer;
	    }
	}
