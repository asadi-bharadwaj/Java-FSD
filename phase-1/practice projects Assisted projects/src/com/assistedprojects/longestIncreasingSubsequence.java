package com.assistedprojects;

public class longestIncreasingSubsequence {
	static int ref;
	static int lis(int arr[],int n)
	{
		if(n==1)
			return 1;
		int res,end=1;
		for(int i=1;i<n;i++) {
			res=lis(arr,i);
			if(arr[i-1]<arr[n-1]&&res+1>end)
				end=res+1;
		}
		if(ref<end)
			ref=end;
		return end;
	}
	static int lis1(int[] arr, int n)
	{
		ref=1;
		lis(arr,n);
		return ref;
	}
	public static void main(String[] args)
	{
		int[] arr= {11,12,14,7,59,27,76,55};
		int n=arr.length;
		System.out.println("length of longest integer subsequence is:"+lis1(arr,n)+"\n");
}
}
