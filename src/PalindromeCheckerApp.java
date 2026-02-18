public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "sree";
        System.out.println("Input String: "+input);
        char[] inputChar = input.toCharArray();
        int start =0,end=inputChar.length-1;
        boolean isPalindrome = true;
        while(start<end){
            if(inputChar[start]!=inputChar[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is it a Palindrome? "+((isPalindrome)?"True":"False"));


    }
}