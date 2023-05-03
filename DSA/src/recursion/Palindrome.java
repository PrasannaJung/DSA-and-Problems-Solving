package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String word = "kayak";
        boolean isPalindrome = isPalindrome(word);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String string){
        if(string.length() == 0 || string.length() == 1){
            return true;
        }

        if(string.charAt(0) == string.charAt(string.length()-1)){
            return isPalindrome(string.substring(1,string.length()-1));
        }else{
            return false;
        }
    }
}
