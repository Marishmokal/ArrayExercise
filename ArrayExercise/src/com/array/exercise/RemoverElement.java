package com.array.exercise;//remove element from array

public class RemoverElement {
public static void main(String[] args) {
	int[]x= {10,15,20,23,25,30};
	int count=0;
	int n=23;
	for(int i=0;i<x.length;i++)
	{
	if(x[i]==n)
	{
		count++;
	}
	else
	{
	System.out.println(" "+x[i]);
	}
	}

}
	
}
