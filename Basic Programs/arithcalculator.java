package prgs;

import java.util.Scanner;

public class arithcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		char sym = in.next().charAt(0);
		switch(sym) {
		case '+': System.out.println(num1+num2);break;
		case '-': System.out.println(num1-num2);break;
		case '*': System.out.println(num1*num2);break;
		case '/': System.out.println(num1/num2);break;
		case '%': System.out.println(num1%num2);break;
		default: System.out.println("Wrong Input");break;
		}
	}

}
