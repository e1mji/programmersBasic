class Solution {
    public static int[] solution(int money) {
		int n=money/5500;
		System.out.println(n);
		int pocket= money-(n*5500);
		System.out.println(pocket);
        int[] answer = {n,pocket};
        return answer;
    }
}