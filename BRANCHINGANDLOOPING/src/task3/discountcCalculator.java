package task3;

import java.util.Scanner;

public class discountcCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the purchase amount: ");
    double amount = sc.nextDouble();
   double discount = 0;
    double finalAmount;
    
    if(amount < 500) {
    	discount = 0;
    	
    }
    else if(500 < 1000) {
    	discount = amount * 0.1;
    	
    }
    else {
    	discount = amount * 0.2;
    }
    finalAmount = amount - discount;
    
    System.out.println("Purchase Amount : " + amount);
    
    System.out.println("Discount applied : " + discount);
    
    System.out.println("Final payable amount : " + finalAmount);
    
    sc.close();
	}

}
