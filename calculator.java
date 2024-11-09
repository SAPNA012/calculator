package coreJava;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		int num1; 
		int num2;
		int result;
		
		
		Scanner calc=new Scanner(System.in);
		System.out.println("Enter the value of num1 and num2 :");
        num1=calc.nextInt();
        num2=calc.nextInt();
        System.out.println("Select the oprator:(+,-,*,/,%)");
        char oprator=calc.next().charAt(0);
        
        
        
        switch(oprator){
        case'+':
        	result=num1+num2;
        	System.out.println("the sum is:"+result);
        	break;
        case'-':
        	result=num1-num2;
        	System.out.println("the substraction is:"+result);
        	break;
        case'*':
        	result=num1*num2;
        	System.out.println("the multiplication is:"+result);
        	break;
        case'/':
        	result=num1/num2;
        	System.out.println("the division is:"+result);
        	break;
        case'%':
        	result=num1%num2;
        	System.out.println("the modulus is:"+result);
        	break;
         default:
        	 System.out.println("Invalid input!!!!!  \n Try again with valid input..");
       
        }
   
	}

}
