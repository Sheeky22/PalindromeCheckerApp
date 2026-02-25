import java.util.*;

public class PalindromeCheckerApp {

    private static boolean check(String s,int start, int end){
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

    public static void main(String[] args){

        String input = "madam";
        System.out.println("Input String: "+input);
        boolean isPalindrome = check(input,0,input.length()-1);

        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}