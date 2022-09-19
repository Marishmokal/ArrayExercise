package com.array.exercise;

public class AverageOfAddition {
public static void main(String[] args) {
	int[]x= {15,22,45,20,15};
	int n=x.length;
	average(x,n);
}
public static void average(int x[],int n)
{
	int add=0;
	for(int i=0;i<x.length;i++)
	{
		add=add+x[i];
		
	}
	System.out.println("average is"+add/n);
}
}