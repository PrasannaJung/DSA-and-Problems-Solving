package problems;

import java.util.Arrays;

public class SOE {
    public static void main(String[] args) {

        int n = 10;
        boolean[] primes = new boolean[n+1];
        primeNumbers(n,primes);

        System.out.println(Arrays.toString(primes));

    }

    static void primeNumbers(int n,boolean[] primes){
        for(int i = 2 ; i * i <= n; i++ ){
            if(!primes[i]){
                for(int j = i * 2; j <= n ; j += i ){
                    primes[j] = true;
                }
            }

        }

        for(int i = 2; i <= n ; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
