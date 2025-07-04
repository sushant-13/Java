import java.util.Scanner;

public class OctalToDecimal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String octal = scn.next();

        int decimal = Integer.parseInt(octal, 8);//Octal to Decimal
       
        System.out.println(decimal);
    }
}
