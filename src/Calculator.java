import java.util.Scanner;

// GitHub demonstration updation
public class Calculator {
	
		public static void addition() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter second number");
			int b = scan.nextInt();
			int c=a+b;
			System.out.print("Result" +c);
			
		}
		public static void subtraction() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter second number");
			int b = scan.nextInt();
			int c=a-b;
			System.out.print(a - b + "= " +c);
			
		}
		public static void multiplication() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter second number");
			int b = scan.nextInt();
			int c=a*b;
			System.out.print(a * b + "= " +c);
			
		}
		public static void division() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter second number");
			int b = scan.nextInt();
			int c=a/b;
			System.out.print(a / b + "= " +c);
			
		}
			


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("Enter your choice:");
		Scanner scan = new Scanner(System.in);
		
		int choice=scan.nextInt();
		switch(choice) {
		case 1:addition();break;
		case 2:subtraction();break;
		case 3:multiplication();break;
		case 4:division();break;
		default:System.out.print("Invalid choice, Please enter the correct choice as given below");
		}
		
		
		
		
		
		

	}

}

