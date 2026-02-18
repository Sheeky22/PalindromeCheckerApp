import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "sreekesh";
        System.out.println("Input String: "+input);
        Deque<Character> deque = new ArrayDeque<>();
        boolean isPalindrome = true;
        for(char c: input.toCharArray()){
            deque.addLast(c);
        }
        while(deque.size()>1){
            if(deque.removeFirst()!=deque.removeLast()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}