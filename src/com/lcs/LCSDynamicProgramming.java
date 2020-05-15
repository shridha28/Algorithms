package com.lcs;

public class LCSDynamicProgramming {
	
	
	public static void main(String args[]) {
	
	String str1 = "suraj";
	String str2 = "shridha";
	
	char arr1[] = str1.toCharArray();
	char arr2[] = str2.toCharArray();
	
	/*
	 * int length = calculateLCS(arr1,arr2,arr1.length-1,arr2.length-1);
	 * System.out.println(length);
	 */
	
	int length = calculateLCS(arr1,arr2,arr1.length,arr2.length);
	
	System.out.println(length);
	
	}
	
	static int calculateLCS(char [] arr1,char [] arr2,int m,int n) {
		
		int cal[][] = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||j==0)
					cal[i][j]=0;
				else if(arr1[i-1]==arr2[j-1])
					cal[i][j]= 1+ cal[i-1][j-1];
				else
					cal[i][j] = Math.max(cal[i-1][j], cal[i][j-1]);
			}
		}
		
		printLCS(cal, arr1, arr2);
		return cal[m][n];
	}
	
	
	static void printLCS(int [][]matrix,char arr1[],char arr2[]){
		
		int i=arr1.length;int j=arr2.length;
		
		String s = "";
		
		while(i>0 && j>0) {
			if(arr1[i-1]==arr2[j-1]) {
				s = arr1[i-1]+s;
				i--;j--;
			}	
			else {
				if(matrix[i-1][j]>matrix[i][j-1]) 
					i--;
				else
					j--;
			}
		}
		
		System.out.println(s);
	}
}
