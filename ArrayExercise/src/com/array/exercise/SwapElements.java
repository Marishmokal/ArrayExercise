package com.array.exercise;//swap elements from array

public class SwapElements {
public static void main(String[] args) {
	int[]x= {10,45,20,25,30,35,40,15};
	 int n=x.length;
	 swap(x);
	 for(int i=0;i<x.length;i++)
	 {
		 System.out.print(" "+x[i]);
	 }
}
public static void swap(int[]x)
{
	for(int i=0;i<x.length-1;i++)
	{
		x[1]=x[1]+x[7];
		x[7]=x[1]-x[7];
		x[1]=x[1]-x[7];
		
		System.out.print(" "+x[i]);
	}
}
}
