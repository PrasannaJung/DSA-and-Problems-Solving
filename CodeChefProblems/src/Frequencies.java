import java.util.Scanner;

public class Frequencies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lowerFrequencyRange = 67;
        int upperFrequencyRange = 45000;

        int testCases = in.nextInt();
        for (int i = 1; i <= testCases; i++) {
            int audibleFrequency = in.nextInt();
            if(audibleFrequency >= lowerFrequencyRange && audibleFrequency <= upperFrequencyRange){
                System.out.println("YES");
            }else{
                System.out.println("NO"); 
            }
        }
    }
}
