package slprogram;
import java.util.Scanner;
public class calci {

	public static void main(String[] args) {
		
				    char operator;
				    Double n0, n1, output;

				    // create an object of Scanner class
				    Scanner input = new Scanner(System.in);

				    // ask users to enter operator
				    System.out.println("Choose an operator: -, +, /, or *");
				    operator = input.next().charAt(0);

				    // ask users to enter numbers
				    System.out.println("Enter first number");
				    n0 = input.nextDouble();

				    System.out.println("Enter second number");
				    n1 = input.nextDouble();

				    switch (operator) {

				      // performs addition between numbers
				      case '+':
				        output = n0 + n1;
				        System.out.println(n0 + " + " + n1 + " = " + output);
				        break;

				      // performs subtraction between numbers
				      case '-':
				        output = n0 - n1;
				        System.out.println(n0 + " - " + n1 + " = " + output);
				        break;

				      // performs multiplication between numbers
				      case '*':
				        output = n0 * n1;
				        System.out.println(n0 + " * " + n1 + " = " + output);
				        break;

				      // performs division between numbers
				      case '/':
				        output = n0 / n1;
				        System.out.println(n0 + " / " + n1 + " = " + output);
				        break;

				      default:
				        System.out.println("Invalid operator!");
				        break;
				    }

				    input.close();
				  }
		}




