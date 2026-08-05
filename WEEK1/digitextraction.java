import java.util.Scanner;
public class digitextraction {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int n = input.nextInt();
    int d1 = n%10;
    int d2 = (n/10)%10;
    int d3 = (n/100)%10;
    System.out.println("the digits are " + d3 + " " + d2 + " " + d1);
    }
}