public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str1 = "madam";
        System.out.println("Input String: "+str1);
        String strReverse = "";
        for(int i=str1.length()-1;i>=0;i--){
            strReverse+=str1.charAt(i);
        }
        System.out.println(strReverse);
        System.out.println("Is it a Palindrome? "+(str1.equals(strReverse)?"True":"False"));


    }
}