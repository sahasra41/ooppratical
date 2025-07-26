package oop_pratical;
import java.util.Scanner;
public class TernaryOpr {
public static void main(String args[]) {
	int febDays;
	String result;
	Scanner sc= new Scanner(System.in);
	System.out.println("type febDays:");
	febDays=sc.nextInt();
	result = (febDays == 28) ? "not a leap year" : "leap year";
	System.out.println(result);
}
}
