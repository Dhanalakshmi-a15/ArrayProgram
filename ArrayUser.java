package Array;
import java.util.Scanner;

public class ArrayUser {
	public static void main (String arg[]) {
		
		Scanner sc= new Scanner(System.in);
		//ask user for array size
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		int[] arr =new int[n];
		
		//read array elemnts
		System.out.println("Ente"+n+"Elements:");
	
	
	
	//read array elments
	System.out.println("Enter "+n+"elements:");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	//Ask for the index to access 
	System.out.println("Enter the index of the elements you want to access(0 to");
	int index=sc.nextInt();
	//check if  index is valid
	if(index>=0&& index<n) 
	{
//		System.out.println("Elements at index"+index+"is:"+arr[index]);
		
	}else
	{
		System.out.print("Invalid index! please enter a value between0 and:"+(n-1));
		
		
		
	}
	sc.close();
	
}
}