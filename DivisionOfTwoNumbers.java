import java.util.Scanner;

public class DivisionOfTwoNumbers{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if(b == 0){
            System.out.println("Cannot divide by zero.");
        } else {
            int result = a / b;
            System.out.println(result);
        }
    }
}
