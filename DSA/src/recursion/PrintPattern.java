package recursion;

public class PrintPattern {
    public static void main(String[] args) {
        printStars(1,1);
    }

    public static void printStars(int row, int cols){
        if(row > 5 ){
            return;
        }
        if( cols <= row){
            System.out.print("* ");
            printStars(row,cols+1);
        }else{
            System.out.println();
            printStars(row+1,1);
        }
    }

}
