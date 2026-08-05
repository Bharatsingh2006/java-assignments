import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = input.nextInt();
    System.out.println("enter the second number");
    int b = input.nextInt();
    System.out.println("enter the operator");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
