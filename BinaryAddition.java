
import java.util.Scanner;

public class BinaryAddition{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String b1 = scn.next();
        String b2 = scn.next();

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int sum = n1 + n2;

        System.out.println(Integer.toBinaryString(sum));
    }
}

