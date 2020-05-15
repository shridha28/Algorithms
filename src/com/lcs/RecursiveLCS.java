package com.lcs;

public class RecursiveLCS {
	
	
	public static void main(String args[]) {
		
		String str1 = "sesha";
		String str2 = "suhas";
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		
		int length = calculateLCS(arr1,arr2,arr1.length-1,arr2.length-1);
		System.out.println(length);
		
	}
	
	//complexity of 2^n
	static int calculateLCS(char[] arr1,char[] arr2,int n,int m) {
		
		if(n<0||m<0)
			return 0;
		else if(arr1[n]==arr2[m])
			return 1+calculateLCS(arr1, arr2, n-1, m-1);
		else
			return Math.max(calculateLCS(arr1, arr2, n, m-1), calculateLCS(arr1, arr2, n-1, m));
	}

}
