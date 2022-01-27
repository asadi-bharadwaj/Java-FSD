package com.assistedprojects;
public class Arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b ={{1,2,3},{2,4,5},{4,4,5}};
for(int j=0;j<3;j++) {
	for(int k=0;k<3;k++) {
		System.out.print(b[j][k]+" ");
	}
	System.out.println();
}
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
