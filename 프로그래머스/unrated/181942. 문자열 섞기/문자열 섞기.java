class Solution {
    public String solution(String str1, String str2) {
		String st="";
        int n =0;
		for(int i =0; i<str1.length(); i++) {
				st+=str1.charAt(i);
				st+=str2.charAt(i);
		}
		String answer = st;
		return answer;
    }
}