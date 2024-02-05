package myEighthProject;
import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		double number1,number2;
		int select ;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter first number:");
		number1=input.nextDouble();
		System.out.print("Please enter second number:");
		number2=input.nextDouble();
		
		System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
		System.out.print("Please choose what you want to do:");
		select=input.nextInt();
		if(select==4&&number2==0) {
			System.out.println("A number cant be divided by zero");
			
		}
		else {
		
		switch(select) {
		case 1:System.out.println("Addition: "+(number1+number2));
		break;
		case 2:System.out.println("Substraction: "+(number1-number2));
		break;
		case 3:System.out.println("Multiplication: "+(number1*number2));
		break;
		case 4:System.out.println("Division: "+(number1/number2));
		break;
		default:
		

		
		}
		
	}

}
}
