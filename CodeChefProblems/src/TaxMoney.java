import java.util.Scanner;

public class TaxMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=1;i<=testCases;i++){
            int earnedMoney = in.nextInt();
            if(earnedMoney > 100 ){
                System.out.println(earnedMoney - 10);
            }else{
                System.out.println(earnedMoney);
            }

        }
    }
}
