package recursion;

public class OneToN {
    public static void main(String[] args) {
        printRev(3);
    }

    public static void printRev(int n){
        if(n == 0){
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }

    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
