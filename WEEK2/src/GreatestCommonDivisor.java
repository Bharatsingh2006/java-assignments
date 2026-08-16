import java.util.Scanner;
public class GreatestCommonDivisor {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int first = sc.nextInt();
    System.out.print("Enter second number: ");
    int second = sc.nextInt();
    System.out.println("GCD: " + gcd(first, second));}
    static int gcd(int first, int second) {
    while (second != 0) {
    int remainder = first % second;
    first = second;
    second = remainder;}
    return first;}}