import java.util.Scanner;
public class rect {
    public static void main(String[]args){
    System.out.println("enter the length of rectangle");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    System.out.println("enter the width of rectangle");
    int width = input.nextInt();
    int perimeter= (2*length)+(2*width);
    System.out.println("perimeter " + perimeter);
    int area = length*width;
    System.out.println("area " + area);
    }

}