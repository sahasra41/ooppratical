package oop_pratical;
import java.util.Scanner;
public class LogicalOperator {
	  public static void main(String[] args) {
int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("type a:");
		a=sc.nextInt();
		System.out.println("type b:");
		b=sc.nextInt();
		System.out.println("type c:");
		c=sc.nextInt();
		System.out.println((a > b) && (c > a));  
	    System.out.println((a < b) || (c > a));  
	    System.out.println(!(a == b));  
		  
		  
	  }
}
