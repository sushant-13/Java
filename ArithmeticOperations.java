import java.util.Scanner;

public class ArithmeticOperations{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if(b == 0){
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(a / b);
            System.out.println(a % b);
        }
    }
}
