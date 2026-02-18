import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";
        System.out.println("Input String: "+input);
        Stack<Character> stack = new Stack<>();
        boolean isPalindrome = true;
        for(char c: input.toCharArray()){
            stack.push(c);
        }
        for(char c: input.toCharArray()){
            if(c!=stack.pop()){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}