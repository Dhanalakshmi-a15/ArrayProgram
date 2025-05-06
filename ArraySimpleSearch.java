package Array;

import java.util.Scanner;
public class ArraySimpleSearch {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		//input array size
		System.out.println("Enter number of elements");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		//inputs aaray elements 
		System.out.println("enter"+size+"elemrnts");
		for(int i=0;i<size;i++) 
		{
			arr[i]=sc.nextInt();
		}
		//input search elements
		System.out.println("enter the number of search");
		int search=sc.nextInt();
		//Search without using boolean
		int index=-1;
		for(int i=0;i<size;i++) {
			if(arr[i]==search) {
				index=i;
				break;
			}
		}
		
		//In java (and must programing languages),index =-1 is a speacial 
		//value we use to indicated "not found" when searching in array or lists.
		
		
		//print the result
		if(index!=1) {
			
			System.out.println( search+"found at index "+index);
			
		}
		else {
			System.out.println(search+"Not found is array");
		}
		sc.close();
	}
	

}
