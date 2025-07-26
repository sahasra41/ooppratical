package oop_pratical;
import java.util.Scanner;

public class AssignmentOper {
	 public static void main(String[] args) {
		 int a,b;
			Scanner sc= new Scanner(System.in);
			System.out.println("type a:");
			a=sc.nextInt();
		  b=a;
		    System.out.println("b using =: " + b);

		   
		    b += a;
		    System.out.println("b using +=: " + b);

		    b *= a;
		    System.out.println("b using *=: " + b);
		  }
		

	 }

