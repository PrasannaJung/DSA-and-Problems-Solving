import java.util.*;
import java.lang.*;
import java.io.*;

class BrainTests {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int thresholdLimit = in.nextInt();
         int workingBits = in.nextInt();

         if(workingBits > thresholdLimit){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
     }
}
