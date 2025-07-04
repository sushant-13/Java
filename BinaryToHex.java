import java.util.Scanner;

public class BinaryToHex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String binary = scn.next();

        int decimal = Integer.parseInt(binary, 2);//binary to decimal
        String hex = Integer.toHexString(decimal).toUpperCase();//decimal to hex

        System.out.println(hex);
    }
}
