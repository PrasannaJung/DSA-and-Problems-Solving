package recursion;

public class IsPrime {
    public static void main(String[] args) {
        boolean result = isPrime(28,2);
        System.out.println(result);
        if(result){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }

    public static boolean isPrime(int n, int i){
        if(i == n){
            return true;
        }
        return n % i != 0 && isPrime(n,i+1);
    }
}
