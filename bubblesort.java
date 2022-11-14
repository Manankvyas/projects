package typesofsearches;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		char[] arr = {'a','b','d','f','g','z'};
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the key to be searched");
		char key = scan.next().charAt(0) ;
		int low =0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid= (low + high)/2;
			if(key==arr[mid])
			{
				System.out.println("the char found at " + mid);
				break;
			}
			else if(key < arr[mid])
			{
				high=mid-1;
			}
			else if(key > arr[mid])
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("char not found");
		}

	}

}
