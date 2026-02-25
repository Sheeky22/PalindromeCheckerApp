import java.util.*;

public class PalindromeCheckerApp {

    interface PalindromeStrategy{
        public boolean checkPalindrome(String input);
        }
    static class stackStrategy implements PalindromeStrategy{

        public boolean checkPalindrome(String input){
            System.out.println("Implemented Using Stack Strategy!");
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
            return isPalindrome;
        }
        
    }

    static class dequeStrategy implements PalindromeStrategy{
        public boolean checkPalindrome(String input){
            System.out.println("Implemented Using Deque Strategy!");
            System.out.println("Input String: "+input);
            Deque<Character> deque = new ArrayDeque<>();
            boolean isPalindrome = true;
            for(char c: input.toCharArray()){
                deque.addLast(c);
            }
            while(deque.size()>1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    isPalindrome = false;
                    break;
                }
            }
            return isPalindrome;
        }
    }



    public static void main(String[] args){

        String input = "saippuakivikauppias";
        PalindromeStrategy[] strategies = { new stackStrategy(), new dequeStrategy() };

        System.out.println("--- Algorithm Comparison ---");
        System.out.printf("%-20s | %-15s | %-20s%n", "Strategy", "Result", "Time (ns)");
        System.out.println("------------------------------------------------------------");

        // 2. Execution Loop
        for (PalindromeStrategy s : strategies) {
            long start = System.nanoTime();

            boolean isPalindrome = s.checkPalindrome(input);


            long end = System.nanoTime();
            long duration = end - start;

            System.out.println("Is it a Palindrome? " + ((isPalindrome) ? "True" : "False"));

            String strategyName = s.getClass().getSimpleName();
            System.out.printf("%-20s | %-15b | %-20d%n", strategyName, isPalindrome, duration);
        }

    }
}