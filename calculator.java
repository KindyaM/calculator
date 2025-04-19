package calc;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner input = new Scanner(System.in);
				System.out.println("Available operations are: add (+), multiply(*), divide(/) and subtract(-), choose symbols only");
				
				System.out.println("Enter an operation");
				char operator = input.next().charAt(0);
			
				System.out.println("How many numbers?");
				int count = input.nextInt();
				
				double result = 0;
				
				for(int i = 0; i < count; i ++ ) {
					System.out.println("Enter number:  " );
					double num = input.nextDouble();
					
					if (i ==0) {
						result = num;
					}else {
						switch (operator) {
						case '+' :
							result +=num;
								break;
						case '-' :
							result -= num;
								break;
						case '*' :
							result *= num;
								break;
						case '/' :
							if (num != 0) {
							result /= num;
							}else {
								System.out.print("You can not divide a number by 0! ");
							}
								 break;
						default:
							System.out.println("Invalid operator!");
								return;
						}
					}
					
					
					
					
				}
				
				System.out.println("Result =" + result);
				
		}

	}


