package Calculator;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("ENTER A CHOICE TO USE THE CALCULATOR");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVISION");
			System.out.println("5. SQRT");
			System.out.println("6. EXIT");
			
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("ENTER A NUMBER");
				double num1 = sc.nextDouble();
				System.out.println(num1 + "ENTER ANOTHER NUMBER");
				double num2 = sc.nextDouble();
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println("ENTER A NUMBER");
				double num01 = sc.nextDouble();
				System.out.println(num01 + "ENTER ANOTHER NUMBER");
				double num02 = sc.nextDouble();
				System.out.println(num01 - num02);
				break;
			case 3:
				System.out.println("ENTER A NUMBER");
				double num10 = sc.nextDouble();
				System.out.println(num10 + "ENTER ANOTHER NUMBER");
				double num20 = sc.nextDouble();
				System.out.println(num10 * num20);
				break;
			case 4:
				System.out.println("ENTER A NUMBER");
				double num11 = sc.nextDouble();
				System.out.println(num11 + "ENTER ANOTHER NUMBER");
				double num21 = sc.nextDouble();
				System.out.println(num11 / num21);
				break;
			case 5:
				System.out.println("ENTER A NUMBER");
				double num12 = sc.nextDouble();
				System.out.println(Math.sqrt(num12));
				break;
			case 6:
				break;
			}
		}while(ch != 6);
	}

}
