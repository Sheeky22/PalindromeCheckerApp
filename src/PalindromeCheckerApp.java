public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str1 = "madam";
        System.out.println("Input String: "+str1);
        boolean isPalindrome =true;
        for(int i=0;i<str1.length()/2;i++){
            if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? "+(isPalindrome?"True":"False"));


    }
}