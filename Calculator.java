import java.util.Scanner;
public class calc{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a =sc.nextDouble();
		System.out.println("Enter the Second number: ");
		double b =sc.nextDouble();
		System.out.println("Enter operation(+ - * /): ");
		char op= sc.next().charAt(0);
		double result;
		switch(op) {
		case '+': result=a+b;
		break;
		case '-': result=a-b;
		break;
		case '*': result=a*b;
		break;
		case '/': result=a/b;
		break;
		default: System.out.println("Invalid Operator");
		return;
		}
		System.out.println("Result: "+ result);
	}
}