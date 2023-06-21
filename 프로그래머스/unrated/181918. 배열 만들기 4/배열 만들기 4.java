class Solution {
    static int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int stkSize = 0;
        for(int i =0; i<arr.length; i++) {
         	if(	stkSize==0 || stk[stkSize-1] < arr[i]) {
         		stk[stkSize++] = arr[i];
         	}
        	else if (stkSize >0 || stk[stkSize-1] >= arr[i]){
        		stkSize--;
        		i--;
        	}
        }
        int[] result = new int[stkSize];
        for(int j = 0; j<stkSize; j++) {
        	result[j] = stk[j];
        }
        
        return result;
    }
}