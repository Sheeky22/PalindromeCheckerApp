import java.util.*;

public class PalindromeCheckerApp {

    static class PalindromeService{

        private boolean check(String s,int start, int end){
            if(start>=end){
                return true;
            }
            else if (s.charAt(start)!=s.charAt(end))            {
                return false;
            }
            else{
                start++;
                end--;
                return check(s,start,end);
            }
        }

        public void checkPalindrome(String input){
            System.out.println("Input String: "+input);

            boolean isPalindrome = check(input,0,input.length()-1);

            System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));
        }
        
    }



    public static void main(String[] args){

        PalindromeService str1 = new PalindromeService();
        str1.checkPalindrome("madam");
        str1.checkPalindrome("sreekesh");


    }
}