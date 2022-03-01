import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		        
		System.out.println("Hello!");
        System.out.println("What do you want to do?");
        System.out.println("\nPress 'A' for Addition");
		System.out.println("Press 'S' for Subtraction");
		System.out.println("Press 'M' for Multiplication");
		System.out.println("Press 'D' for Division\n");

		char operation;
		int num1,num2;
        	
		operation=input.next().charAt(0);
        System.out.println("Enter the number 1...");
        num1=input.nextInt();
		System.out.println("Enter the number 2...");
        num2=input.nextInt();
		
		Calculator x=new Calculator();
		x.getData(num1,num2);

		switch(operation){
			case 'A':case 'a': x.add();break;
			case 'S':case 's': x.subtract();break;
			case 'M':case 'm': x.multiply();break;
			case 'D':case 'd': x.divide();break;
			default: System.out.println("Invalid Operation");	
		} 
	}
}