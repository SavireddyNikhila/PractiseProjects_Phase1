package com.simplilearn.prog;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1 = 0,num2 = 0,result=0;
		char operator;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to ARITHMETIC CALCULATOR !!!");
		System.out.println("************************************");
		
		do{
			System.out.println("--> + for Addition");
			System.out.println("--> - for Subtraction");
			System.out.println("--> * for Multiplication");
			System.out.println("--> / for Division");
			System.out.println("--> Q for Quit from the Calculator");
			System.out.println("Enter any operator specified to perform calculation");
			operator=sc.next().charAt(0);
			
			if(operator!='Q'){
				System.out.println("Enter first number: ");
				num1=sc.nextDouble();
				System.out.println("Enter second number: ");
				num2=sc.nextDouble();

				switch(operator){
				case '+':
					result=num1+num2;
					break;
				case '-':
					result=num1-num2;
					break;
				case '*':
					result=num1*num2;
					break;
				case '/':
					result=num1/num2;
					break;
				default:
					System.out.println("Please enter the specified operator only !!");
					break;
					
				}

			}
			else{
				System.out.println("Calculator exited Successfully!!");
				System.exit(0);
			}
			if(operator=='+' || operator=='-' || operator=='*' || operator=='/')
			{
				System.out.println("The result of the above calculation \n"+num1+" "+operator+" "+num2+" = " + result);
				
			}
			System.out.println("**************************************************************************************");
			
		}while(operator!='Q');
	}

}
