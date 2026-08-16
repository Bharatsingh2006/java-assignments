import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    if (isPrime(number)) {
        System.out.println("Prime number");
    } else {
        System.out.println("Not a prime number");}}
    static boolean isPrime(int number) {
    if (number < 2) {
        return false;}
    for (int divisor = 2; divisor * divisor <= number; divisor++) {
        if (number % divisor == 0) {
            return false;}}
    return true;}}