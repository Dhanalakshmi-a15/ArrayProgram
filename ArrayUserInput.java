package Array;

import java.util.Scanner;

public class ArrayUserInput {
	public static void main(String args[]) {
		//decalres an array of intrger
		//datatype[] arrayname
		int arr1[]= {};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		arr1=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			System.out.println("Element of index "+" "+i+" is "+arr1[i]);
		}
		
	}

}
