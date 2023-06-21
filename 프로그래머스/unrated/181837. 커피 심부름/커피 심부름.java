class Solution {
  	public int solution(String[] order) {
		int americanoPrice = 4500;
		int cafelattePrice = 5000; 
        int total = 0;

        for(int i =0; i < order.length; i++) {
            String menu = order[i];
        	if (menu != null && menu.equals("anything")) {
        		total += americanoPrice;
        	}
        	else if (menu!= null && menu.contains("americano")) {
        		total +=americanoPrice;
        	}
        	else if (menu != null && menu.contains("cafelatte")) {
        		total += cafelattePrice;
        	}
        }	
        
        return total;
    }
}