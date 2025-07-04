import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String binary = scn.next();

        int decimal = Integer.parseInt(binary, 2);
       
        System.out.println(decimal);
    }
}
