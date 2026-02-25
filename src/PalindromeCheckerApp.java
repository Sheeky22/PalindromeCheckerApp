import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";
        System.out.println("Input String: "+input);
        LinkedList<Character> ll = new LinkedList<>();
        boolean isPalindrome = true;
        for(char c: input.toCharArray()){
            ll.addLast(c);
        }
        while(ll.size()>1){
            if(ll.poll()!=ll.pollLast()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}