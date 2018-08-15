package com.ganesh.ds.stack;

import java.util.Stack;

public class InToPost {

	static int Pre(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
			 
		case '*':
		case '/':
			return 2;
			
		case '^':
			return 3;
			
		}
		return -1;
	}
	
	
	//The function that converts infix to postfix
	
	static String InfixToPostfix(String exp)
	{
		//initializing empty string for result
		String result = new String("");
		
		//initialize empty stack
		Stack<Character> stack = new Stack<Character>();
		
		
		//iterate through characters of the exp expression
		for(int i=0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i); // stores the visited character
			
			//if the visited character is an operand, add it to the output
			if(Character.isLetterOrDigit(c))
			{ // "a+b*(c^d-e)^(f+g*h)-i"
				result = result + c;
			}
			
			//If the scanned character is a ( then push it to the stack
			else if(c =='(')
			{
				stack.push(c);
			}
			//If the scanned character is a ), then pop and outtput from the stack until ( is encountered
			else if(c == ')')
			{
				while(!stack.isEmpty() && stack.peek()!= '(')
				{
					result = result + stack.pop();
					
					/*if(stack.isEmpty())
						return "Invalid Expression";
					else
						stack.pop();*/
				}
				stack.pop();
			}
			else //operator is ecountered 
			{
				while(!stack.isEmpty() && Pre(c) <= Pre(stack.peek()))
				{	result = result + stack.pop();
				
				}
				stack.push(c);
				
			}
		}
			//pop all operators from stack
			while(!stack.isEmpty()) 
			{
				result = result + stack.pop();
			}
			return result;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp =  "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(InfixToPostfix(exp));
	}

}

//abcd^e-fgh*+^*+i-