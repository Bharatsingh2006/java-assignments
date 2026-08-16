import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = sc.nextInt();
    System.out.println(isLeapYear(year));
}
    static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
         return true;
    } else if (year % 100 == 0) {
        return false;
    } else if (year % 4 == 0) {
        return true;
    } else {
        return false;}}}