import java.util.Scanner;
public class leapyear {     
public static void main(String[] args) {                         
 System.out.println("enter a year:");
Scanner input = new Scanner(System.in);
int year = input.nextInt();
boolean leapyear = isleapyear(year);
System.out.println(year + " is a leap year: " + leapyear);
input.close();}
public static boolean isleapyear(int year){
   if(year%4==0 && year%100!=0 || year%400==0){
       return true;}
    else
        return false;
}}