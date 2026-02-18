import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";
        System.out.println("Input String: "+input);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        boolean isPalindrome = true;
        for(char c: input.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        while(!queue.isEmpty()){
            if(queue.remove()!=stack.pop()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}