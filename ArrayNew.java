package Array;
import java.util.Scanner;

public class ArrayNew {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else {
				max=arr[i];
			}
		}
		System.out.println("Max value"+max);
		System.out.println("Max value"+min);
	}

}
