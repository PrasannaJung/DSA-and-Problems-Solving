public class AdvancedPatterns {
    public static void main(String[] args) {
//        pattern28(5);
        pattern30(5);
//        pattern29(5);
//        pattern35(4);
    }

    static void pattern28(int n){
        for(int row=1;row<2*n;row++){
            int cols = row > n ? n - (row -n) : row;
            int spaces = n - cols;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=cols;c++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern30(int n){
        for(int row=1;row<=5;row++){
            for(int s=1;s<=n-row;s++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern35(int n){
        for(int row=1;row<=n;row++){

            int spaces = 2*(n - row);

            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            for(int s =1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern29(int n){
        for(int row=1;row<2*n;row++){
            int spaces = row>n? 2*(row-n):2*(n-row);
            int leftCol = row>n?n-(row-n):row;
            int rightCol = row>n ? n-(row-n) :row;

            for(int col=1;col<=leftCol;col++){
                System.out.print("*");
            }
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
                for(int col=rightCol;col>=1;col--){
                    System.out.print("*");
                }

                System.out.println();
            }
        }
}
