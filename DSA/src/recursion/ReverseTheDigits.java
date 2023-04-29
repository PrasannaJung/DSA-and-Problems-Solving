package recursion;

public class ReverseTheDigits {
    public static void main(String[] args) {
        int result = rev(1234);
        System.out.println(result);
    }

    public static int rev(int n){

        if( n % 10 == n){
            return  n;
        }
        int lengthOfDigits = (int)Math.log10(n) + 1;

        int rem = n % 10;

        return rem * (int)(Math.pow(10,lengthOfDigits)) + rev(n / 10);

    }
}
