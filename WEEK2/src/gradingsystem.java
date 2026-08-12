import java.util.Scanner;
public class gradingsystem {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your score (0-100): ");
    int score = scanner.nextInt();
    String grade;
    if (score > 100 || score < 0) {
        grade = "Invalid score";
    } else if (score == 100 || score >= 80) {
        grade = "Distinction";
    } else if (score == 79 || score >= 70) {
        grade = "Merit";
    } else if (score == 69 || score >=50) {
        grade = "Pass";
    } else {
        grade = "F";
    }
    System.out.println("Your grade is: " + grade);
}
}