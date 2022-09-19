package com.array.exercise;//Ascending order

public class AscendingOrder {
public static void main(String[] args) {
	arrangeAscending();
}
public static void arrangeAscending()
{
	int[]x= {42,18,25,88,67,3};
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if(x[i]>x[j])
			{
				int y=x[i];
				x[i]=x[j];
				x[j]=y;
			}
		}
	}
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]+" ");
	}
}


}
