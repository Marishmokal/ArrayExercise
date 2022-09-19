package com.array.exercise;//return second highest number

import java.util.Arrays;

public class ReturnHighestElement {
public static void main(String[] args) {
	int[]x= {45,72,5,55,103,12,38,21,88};	
	int n=x.length;
	secondHighElement(x,n);
	
}
public static void secondHighElement(int[]x,int n)
{
	int count;
	for(int i=0;i<x.length;i++)
	{
		count =0;
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]>x[j])
			{
			 count=x[i];
			 x[i]=x[j];
			 x[j]=count;
			 
			}
		
		}
		
	}
	System.out.println(x[n-2]);

}
}
