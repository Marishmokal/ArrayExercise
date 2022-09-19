package com.array.exercise;//remove duplicate numbers from array

public class DuplicateRemoval {

	public static void removeDuplicate(int[] x) {
		int count;
		for (int i = 0; i < x.length; i++) {
			count=0;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					count++;
					
				}
			}
			if(count<1)
				
			System.out.print(" "+x[i]);
		}
		
		
	}

	public static void main(String args[]) {
		int[] x = { 2, 42, 2,17, 42, 33, 21,17 };

		removeDuplicate(x);

	}

}
