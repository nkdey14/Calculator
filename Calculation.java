package Exercise2;

import java.util.Scanner;

public class Calculation {
	
	// method used for addition of two numbers
	
	public void addition()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		
		double n2 = sc.nextDouble();
		
		double sum = n1 + n2;
		
		System.out.println("Addition of "+ n1 + " and "+ n2 + " is "+ sum);
	}
	
	// method used for subtraction of two numbers
	
	public void subtraction()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		
		double n2 = sc.nextDouble();
		
		double sub = n1 - n2;
		
		System.out.println("Subtraction of "+ n1 + " and "+ n2 + " is "+ sub);
	}
	
	// method used for multiplication of two numbers
	
	public void multiplication()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		
		double n2 = sc.nextDouble();
		
		double mul = n1 * n2;
		
		System.out.println("Multiplication of "+ n1 + " and "+ n2 + " is "+ mul);
	}
	
	// method used for division of two numbers
	
	public void division()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		
		double n2 = sc.nextDouble();
		
		double div = n1 / n2;
		
		System.out.println("Division of "+ n1 + " and "+ n2 + " is "+ div);
	}
	// method used for modulus of two numbers
	
	public void modulo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		
		int n2 = sc.nextInt();
		
		int mod = n1 % n2;
		
		System.out.println("Mod of "+ n1 + " and "+ n2 + " is "+ mod);
	}
	// method used for finding square root of a number
	
	public void sqroot()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		long n1 = sc.nextLong();
		
		double sqr = Math.sqrt(n1);
		
		System.out.println("Square root of "+ n1 + " is "+ sqr);
	}

	public static void main(String[] args) {
		
		Calculation c = new Calculation(); // created object of the class to access non-static methods
		
		int ch;
		
		do { 
			
		System.out.println("---------------------------- Nitin's Calculator ---------------------------");
			
		System.out.println("---------------------------------------------------------------------------");
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter your choice ..... \n\n1. Addititon \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulo \n6. Square root");
		
		System.out.println();
		
		ch = sc.nextInt(); // taking input from the user
		
		switch(ch)  // based on user input performing operations
		{
			case 1:
			
				c.addition();  // performs addition
				break;
				
			case 2:
				
				c.subtraction();  // performs subtraction
				break;
				
			case 3:
				
				c.multiplication();  // performs multiplication
				break;
				
			case 4:
				
				c.division();  // performs division
				break;
				
			case 5:
				
				c.modulo();  // performs modulus
				break;
				
			case 6:
				
				c.sqroot();  // finds square root
				break;
			
			default:
			
				System.out.println("Invalid choice. \nPlease choose a correct option.");
			
		}
		
		}while(ch != 0);	
		
	}

}
