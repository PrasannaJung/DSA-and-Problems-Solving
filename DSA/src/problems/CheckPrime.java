package problems;

public class CheckPrime {
    public static void main(String[] args) {
        boolean isPrime = checkPrime(233);
        System.out.println(isPrime);
    }

    static boolean checkPrime(int n){

        if(n <= 1){
            return false;
        }

        /*
        ***************************************
        // FIRST WAY IS WE CAN CHECK IF THE NUMBER IS DIVISIBLE
        // BY NUMBERS IN RANGE [ 2 - (n-1) ]
        int start = 2; // start from 2 and run until n - 1
        for(int i = start; i <= n - 1 ; ++i){
            if( n % i == 0){
                return false;
            }
        }
        return true;
         */
        /* ************************************************* */
        // ANOTHER WAY IS TO ONLY CHECK UPTO THE SQUARE ROOT BECAUSE
        // IT STARTS REPEATING MULTIPLICATION FROM THERE
        int start = 2;
        while(start * start <= n){
            if( n % start == 0){
                return false;
            }
            start += 1;
        }
        return true;
    }
}
