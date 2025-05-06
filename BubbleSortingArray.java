package Array;
import java.util.Scanner;


public class BubbleSortingArray {
	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		//step1:Input Size
		System.out.println("Enter number of elements:");
		int size=scanner.nextInt();
		int[] array=new int[size];
		
		//setp2: Input Elemnts
		
		System.out.println("enter"+size+"number");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		//step3:bubble sort(no bulit in methods)
		
		for (int i=0;i<size-1;i++) {
			for (int j=0;j<size-i-1;j++)//Reverse-swapping
			{
				
				//for Accending =>
				//for descending=<
				if(array[j]>array[j+1]) {
					//swap
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			//step4:print stored array
			System.out.println("Sorted array (Asending):");
			for (int i=0;i<size;i++) {
				System.out.println(array[i]+"");
			}
				
				
	}	}
           
}
