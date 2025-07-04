import java.util.Scanner;

public class DecimalToHex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println(hex);
    }
}