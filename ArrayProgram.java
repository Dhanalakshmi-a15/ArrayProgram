package Array;

public class ArrayProgram {
	public static void main(String args[]) {
	//declares  an array of integer
	//datatype[] arrayname
	int[] arr;
	//allocating  memory
	arr= new int[5];//correct way
	//initialize values
	arr[0]=12;
	arr[2]=22;
	arr[3]=25;
	arr[4]=29;
	//arr.length to find the array length
	for(int i=0;i<arr.length;i++)//length of the aary
	{
		System.out.println("Elment atINdex"+" "+i+" is "+" " +arr[i]);
		
		
	}

	
	

}}
