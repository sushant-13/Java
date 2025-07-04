import java.util.Scanner;

public class BinaryToOctal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String binary = scn.next();

        int decimal = Integer.parseInt(binary, 2);// Binary to Decimal
        String octal = Integer.toOctalString(decimal);// Decimal to Octal

        System.out.println(octal);
    }
}