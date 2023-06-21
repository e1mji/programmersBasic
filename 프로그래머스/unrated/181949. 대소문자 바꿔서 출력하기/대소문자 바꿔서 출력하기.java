import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
         String convertedStr = "";
        
            for (char c : a.toCharArray()) {
                
            if (Character.isUpperCase(c)) {
                convertedStr += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                convertedStr += Character.toUpperCase(c);
            } else {
                convertedStr += c;
            }
        }
        System.out.println(convertedStr);
        
    }
}