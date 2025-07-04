import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
    }
}
