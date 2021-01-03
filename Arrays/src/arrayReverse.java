import java.util.*;
public class arrayReverse {
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		if(start >= end)
			return;
			
			temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			//Recursive Function calling
			reverseArray(arr, start+1, end-1);
	}
	
	//Utility function to print array on a line 
	static void printArray(int arr[], int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		
		//Declare the array
		int arr[] = new int[n];
		
		System.out.println("Enter array values ");
		
		//Input array values
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		printArray(arr, n);
		reverseArray(arr, 0, n-1);
		System.out.println("Reversed array is - ");
		printArray(arr, n);
		
	}
}
