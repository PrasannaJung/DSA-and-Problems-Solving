package recursion;

public class ReverseAString {
    public static void main(String[] args) {
        String word = "prasanna";
        String reversedWord = reverse(word);
        System.out.println(reversedWord);
    }

    public static String reverse(String string){

        if(string.length() == 1){
            return string;
        }

        return string.charAt(string.length()-1) + reverse(string.substring(0,string.length()-1));
    }

}
