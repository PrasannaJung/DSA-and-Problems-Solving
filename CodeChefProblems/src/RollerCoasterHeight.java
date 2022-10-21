/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RollerCoasterHeight
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        for(int i = 1;i<=testCases;i++){
            int height = scn.nextInt();
            int minHeight = scn.nextInt();
            if(height >= minHeight){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}