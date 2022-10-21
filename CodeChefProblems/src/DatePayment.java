import java.util.*;
import java.lang.*;
import java.io.*;

class DatePayment {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();

         for(int i = 1;i < testCases;i++){
         int billMoney = in.nextInt();
         int moneyBoyHas = in.nextInt();
            if(moneyBoyHas >= billMoney){
                 System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
         }
     }
}
