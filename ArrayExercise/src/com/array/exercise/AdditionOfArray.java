package com.array.exercise;

public class AdditionOfArray {
public static void main(String[] args) {
	int[]x= {10,20,30,40,50};
	int[]y= {50,40,30,20,10};
	addition(x,y);
	if(x.length !=y.length)
	{
		System.out.println("arrays must be same");
		return;
	}
}
public static int addition(int[]x,int[]y)
{
	int[]z=new int[x.length];
	for(int i=0;i<x.length;i++)
	{
		z[i]=x[i]+y[i];
	}
	for(int i=0;i<x.length;i++)
	{
		System.out.println(z[i]);
	}
	return 0;
}
}
