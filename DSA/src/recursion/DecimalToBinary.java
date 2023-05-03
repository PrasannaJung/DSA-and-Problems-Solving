package recursion;

public class DecimalToBinary {
    public static void main(String[] args) {

        int decimal = 97;
        String result = decToBin(decimal,"");
        System.out.println(result);

    }

    public static String decToBin(int decimal,String result){

        if(decimal <= 0){
            return result;
        }

        result = decimal % 2 + result;
        return decToBin(decimal / 2,result);

    }
}
