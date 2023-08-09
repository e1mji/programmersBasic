class Solution {
    public String solution(String my_string) {
      String answer = "";
		char ch = '0';
		for(int i =0; i<my_string.length(); i++) {
			ch = my_string.charAt(my_string.length()-1-i);
			answer+=ch;
		}
		return answer;
    }
}