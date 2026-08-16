import java.util.Scanner;
public class MarksProcessor {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mark;
    int count = 0;
    int sum = 0;
    int highest = 0;
    int passes = 0;
    int failures = 0;
    System.out.print("Enter mark (-1 to stop): ");
    mark = sc.nextInt();
        while (mark != -1) {
        if (mark >= 0 && mark <= 100) {
        count++;
        sum = sum + mark;
        if (mark > highest) {
        highest = mark;}
        if (mark >= 50) {
        passes++;
        } else {
        failures++;}}
        System.out.print("Enter mark (-1 to stop): ");
        mark = sc.nextInt();}
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum: " + sum);
        if (count > 0) {
        double average = (double) sum / count;
        System.out.println("Average: " + average);
        System.out.println("Highest mark: " + highest);
        } else {
        System.out.println("Average: 0");
        System.out.println("Highest mark: 0");}
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);}}