package task3;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner (System.in);
   
   System.out.println("Enter the number: ");
   
   int num = sc.nextInt();
   
   if (num>0) {
	   System.out.println(num + " is Positive.");
   }
   else if(num<0) {
	   System.out.println(num + " is Negative.");
   }
   else {
	   System.out.println(num + " is Zero.");
	   
   }
	}

}
