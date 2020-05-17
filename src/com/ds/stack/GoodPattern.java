package com.ds.stack;

import java.util.Stack;

public class GoodPattern {
	
	public static void main(String args[]) {
		int[] data = {1,-1,1,-1};
		
		
		Stack<Integer> stckMe = new Stack();
		
		stckMe.push(data[0]);
		
		for(int j=1;j<data.length;j++) {
			if(stckMe.pop()+data[j]==0)
				stckMe.push(data[j]);
		}
		System.out.println(stckMe);
	}

}
