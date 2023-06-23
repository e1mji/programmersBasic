import java.util.HashMap;
class Solution {
	public int solution(int[] nums) {
		HashMap<String, Integer> map = new HashMap<>();
		int answer =0;
		for(Integer num : nums) {
			map.put(num+"번 포켓몬",map.getOrDefault(num+ "번포켓몬",0)+1);
		}
		System.out.println(map);
		
		int n = nums.length/2;
		int m = map.size();
		
		answer = n > m ? m :n;
		
		return answer;
	}
}