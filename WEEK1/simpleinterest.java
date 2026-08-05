import java.util.Scanner;
public class simpleinterest {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the principal amount");
    double p = input.nextDouble();
    System.out.println("enter the rate of interest");
    double r = input.nextDouble();
    System.out.println("enter the time in years");
    double t = input.nextDouble();
    double si = (p * r * t) / 100;
    double finalAmount = p + si;
    System.out.println("the simple interest is " + si);
    System.out.println("the final amount is " + finalAmount);
    }
}