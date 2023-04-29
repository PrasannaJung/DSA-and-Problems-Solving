package recursion;

public class Factorial {

    public static void main(String[] args) {
        int factResult = fact(5);
        System.out.println("The factorial is "+factResult);
    }

    public static int fact(int n){
        if(n <= 1){
            return 1;
        }

        return n * fact(n-1);

    }

}
