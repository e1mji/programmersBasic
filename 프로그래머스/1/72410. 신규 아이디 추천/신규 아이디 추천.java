class Solution {
    public String solution(String new_id) {					//	new_id : 입력값 
//        UpperCase()
//            
//        3단계 replace
//        4단계 substring
    	
    	String answer = "";									//	출력하려는 값 
    	
    	//	1단계 	
    	new_id = new_id.toLowerCase();
    	
    	//	2단계					조건에 맞는 글자만 answer에 더하기 		이후 단계에서는 answer로 작업 (new_id X)
    	
    	for(int i=0; i < new_id.length(); i++) {
    		char ch = new_id.charAt(i);
   
    		if('a'<= ch && 'z' >= ch) {
    			answer += ch;
    		}
    		
    		if('0'<= ch && '9' >= ch) {
    			answer += ch;
    		}
    		
    		if (ch == '-' || ch == '_' || ch == '.' ) {
    			answer += ch;
    		}
    	}
        
        //	3단계
    
    	while(answer.contains("..")) {
    		
    		answer = answer.replace("..", ".");
  
    		}
    		
    
    	
    	//	4단계 				0번					마지막번호 
    	
    	if (answer.startsWith("."))
    		answer = answer.substring(1);
    	if (answer.endsWith(".")) {
    		answer = answer.substring(0, answer.length() - 1);
  
    	}
    	
    	//	5단계
    	if (answer.length() == 0) {
    		answer += "a";
    	}
    	
    	
    	// 6단계
    	
    	if(answer.length() >= 16) {
    		answer = answer.substring(0,15);
    		if (answer.endsWith(".")) {
    			answer = answer.substring(0,14);
    		}
    	}
        
    
    	//	7단계
    	
    		while(answer.length() <= 2) {
    			
    			String s5 = answer.substring(answer.length()-1);
    			answer += s5;
    			}
    		
    	
    	System.out.println(answer);
    	return answer;										//	함수 종료 후 돌려주는 값 
        
    	
 }

}
