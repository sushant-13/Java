import java.util.Scanner;

public class DecimalToOctal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();

        String octal = Integer.toOctalString(num);
        System.out.println(octal);
    }
}
