import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	public void addition() {
		
		System.out.println("\nEnter the First number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("\nEnter the Second number: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("\nAddition of "+ n1 + " and "+ n2 +" is "+ (n1+n2));
	}
	
	public void subtraction() {
		
		System.out.println("\nEnter the First number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("\nEnter the Second number: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("\nSubtraction of "+ n1 + " and "+ n2 +" is "+ (n1-n2));
	}
	
	public void multiplication() {
		
		System.out.println("\nEnter the First number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("\nEnter the Second number: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("\nMultiplication of "+ n1 + " and "+ n2 +" is "+ (n1*n2));
	}
	
	public void division() {
		
		System.out.println("\nEnter the First number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("\nEnter the Second number: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("\nDivision of "+ n1 + " and "+ n2 +" is "+ (n1/n2));
	}
	
	public void modulo() {
		
		System.out.println("\nEnter the First number: ");
		
		double n1 = sc.nextDouble();
		
		System.out.println("\nEnter the Second number: ");
		
		double n2 = sc.nextDouble();
		
		System.out.println("\nModulo of "+ n1 + " and "+ n2 +" is "+ (n1%n2));
	}
	
	public void squareRoot() {
		
		System.out.println("\nEnter a number: ");
		
		double n1 = sc.nextDouble();
		
		double sqrt = Math.sqrt(n1);
		
		System.out.println("\nSquare root of "+ n1 + " is "+ sqrt);
	}

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c = new Calculator();
		
		int ch;
		
		System.out.println("Enter your name: ");
		
		String name = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("\nHi "+ name + ", Nice to see you!");
		
		Thread.sleep(2000);
		
		x:do {
			
		System.out.println("\n\nEnter your choice: \n\n1. Addition \n\n2. Subtraction \n\n3. Multiplication \n\n4. Division \n\n5. Modulo \n\n6. Square root");
		
		ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
				c.addition();
				break;
				
		case 2:
			
				c.subtraction();
				break;
				
		case 3:
				
				c.multiplication();
				break;
				
		case 4:
			
				c.division();
				break;
		
		case 5:
			
				c.modulo();
				break;
				
		case 6:
			
				c.squareRoot();
				break;
				
		default:
			
				System.out.println("\n\nInvalid choice. Please choose a correct option.");
		}
		Thread.sleep(1000);
		
		System.out.println("\n\nDo you want to continue?(yes/no)");
		
		String ans = sc.next();
		
		if(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
			
			break x;
		}

		}while(ch != 0);
		
		Thread.sleep(1000);
		
		System.out.println("\n\nThanks for using Nitin's Calculator. Have a Nice Day!");
		
	}
}
