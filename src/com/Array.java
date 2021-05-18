package com;

public class Array {
	
	public static int[] arrayInt = new int[5];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = i;
			System.out.println(arrayInt[i]);
		}
		
	}

}
