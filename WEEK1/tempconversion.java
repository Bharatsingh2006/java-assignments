import java.util.Scanner;
public class tempconversion {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the temperature in celsius");
    int c = input.nextInt();
    int f = (c*9/5)+32;
    System.out.println("the temperature in fahrenheit is " + f);
    }
}