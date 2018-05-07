/*ClassName Chang

Version 1.1.0

Copyright Notice Public 

Project 1 - Change Maker

Problem: 

you have to give someone change 

what coins do you give that person? 

Requirements: 

takes user input 

displays the change breakdown as output

1. Understand and Define the Problem 

 ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,

 What’s involved?  

interview users. What are their expectations? What data do they need to access? write a requirements analysis report


2. Determine Input and Output 

Typed input by user: amount of change requested (an integer between 1 and 99) 

Printed output:  

Number of quarters given  

Number of dimes given  

Number of nickels given  

Number of pennies given
*/



import java.util.Scanner;

public class Change {

	
	public static void main(String[] args) {
		
		System.out.println("Enter a cent amount");
	
	        Scanner input = new Scanner(System.in);
	
	        int cents = input.nextInt();
	
	 
	
	        int quarter = 25;
	
	        int dime = 10;
	
	        int nickel = 5;
	
	        int penny = 1;
	
	 
	
	 
	
	        int totalQuarter = (cents / quarter);
	        
	        cents %= quarter;
	
	        int totalDime = (cents / dime);
	        
	        cents %= dime;
	
	        int totalNickel = (cents / nickel);
	        
	        cents %= nickel;
	
	        int totalPenny = (cents / penny);
	        
	        cents %= penny;
	
	         
	
	        System.out.println("Total quarter "+totalQuarter);
	
	        System.out.println("Total dime "+totalDime);
	
	        System.out.println("Total Nickel "+totalNickel);
	
	        System.out.println("Total penny "+totalPenny);
	
	         
	
	    }

	
	
}
