package com.array.exercise;//concat two arrays

import java.util.Arrays;

public class Concat {
public static void main(String[] args) {
	int[]x= {15,25,35,45};
	int[]y= {55,65,75,85,95};
	
	int[]z=new int[x.length+y.length];
	int count=0;
	for(int ab:x)
	{
		z[count++]=ab;
	}
	for(int ac:y)
	{
		z[count++]=ac;
	}
	//for(int i=0;i<z.length;i++)
	{
		System.out.println(Arrays.toString(z));
	}
}
}
