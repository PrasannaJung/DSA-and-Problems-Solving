public class Fibonacci {
    public static void main(String[] args) {
        int n = fib(4);
        System.out.println(n);
    }

    static int fib(int n){
        // writing the base condition
        if(n==1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }
}
