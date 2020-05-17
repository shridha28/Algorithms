package com.ds.stack;

import java.util.Stack;

public class BracketsAlgorithm {

	
	
	
	public static void main(String args[]) {
		
		
		String brackets = "[]{}[]{";
		
		Stack<Character> stack = new Stack();
		
		char[] vars = brackets.toCharArray();
		
		for(int i=0;i<vars.length;i++) {
			
			/*
			 * switch(vars[i]) { case '{': stack.push(vars[i]); break; case '[':
			 * stack.push(vars[i]); break; case '(': stack.push(vars[i]); break; case '}':
			 * stack.pop(); break; case ']': stack.pop(); break; case ')': stack.pop();
			 * break; }
			 */
			
			if(vars[i]=='{' || vars[i]=='[' || vars[i]=='(')
				stack.push(vars[i]);
			else if(vars[i]=='}' || vars[i]==']' || vars[i]==')') {
				if(stack.isEmpty()) {
					System.out.println("not good");
					break;
				}
			if(!arePairs(stack.pop(),vars[i])) {
				System.out.println("not good");
				break;
			 }	
   		  }
		}
		
		if(stack.isEmpty())
			System.out.println("googpne");
		else
			System.out.println("Not good");
	}
	
	
	
	static boolean arePairs(char c1,char c2) {
		if(c1=='{' && c2=='}')
			return true;
		if(c1=='[' && c2==']')
			return true;
		if(c1=='(' && c2==')')
			return true;
		else 
			return false;
	}
	
	
}
