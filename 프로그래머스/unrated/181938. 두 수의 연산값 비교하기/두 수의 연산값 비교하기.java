class Solution {
    	public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a)+ Integer.toString(b));
        int Twoab= 2 * a * b;
        
        if(ab> Twoab) {
        	return ab;
        }
        else if(Twoab>ab) {
        	return Twoab;
        }
        else {
        	return ab;
        }
    }
}