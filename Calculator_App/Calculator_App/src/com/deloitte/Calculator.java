package com.deloitte;

import java.util.HashSet;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<>();
		h.add("+");
		h.add("-");
		h.add("*");
		h.add("/");
		h.add("|");
		h.add("&");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		 double fNum=sc.nextInt();
		System.out.println("Enter the second number");
		double sNum=sc.nextInt();
		System.out.println("Enter the operator");
		String s=sc.next();
		if(h.contains(s)==false)
			System.out.println("Wrong operator entered");
		sc.close();
		switch(s)
		{
		case "+":System.out.println(fNum+sNum);
		         break;
		case "-":System.out.println(fNum-sNum);
		         break;
		case "*": System.out.println(fNum*sNum);
		           break;
		case "/": {
			if(sNum==0) throw new ArithmeticException("Cannot divide by zero");
			else System.out.println(fNum/sNum);
		}
		          break;
		case "|": System.out.println((int)fNum|(int)sNum);
		case "&":System.out.println((int)fNum&(int)sNum);
		
		default:System.out.println("Try again");
			      
		}

	}

}
