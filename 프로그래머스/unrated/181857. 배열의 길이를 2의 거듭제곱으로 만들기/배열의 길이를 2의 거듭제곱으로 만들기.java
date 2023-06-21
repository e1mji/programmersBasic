class Solution {
   	    public int[] solution(int[] arr) {
	    	int length = arr.length;
	    	int nextTwo = 1;
	    	
	    	while(nextTwo< length) {
	    		nextTwo *=2;
	    	}
	    	int zero = nextTwo - length;
	    	
	    	int[] extend = new int[zero+length];
	    	for(int i =0; i<length; i++) {
	    		extend[i] = arr[i];
	    	}
	    	
	    	for(int i =length; i<length + zero; i++) {
	    			extend[i] =0;
	    	}
	    	return extend;
	    }
    
	}
