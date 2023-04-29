package recursion;

public class SimpleNumbersPrint {

    public static void main(String[] args) {
        printNum(5);
    }

    static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

}
