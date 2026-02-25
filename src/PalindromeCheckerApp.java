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

        String input = "A man a plan a canal Panama";
        System.out.println("Input String: "+input);
        String normalisedInput = input.replaceAll("\\s+","").toLowerCase();
        System.out.println("Normalised String: "+normalisedInput);

        boolean isPalindrome = check(normalisedInput,0,normalisedInput.length()-1);

        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}