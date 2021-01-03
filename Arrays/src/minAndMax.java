import java.util.*;
public class minAndMax {
	static class Pair{
		int min;
		int max;
	}
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		int i;
		
		//If there is only one element then return it
		if(n==1) {
			minmax.min = arr[0];
			minmax.max = arr[0];
			return minmax;
		}
		
		//if there are more than one elements, then initialize min and max
		if(arr[0] > arr[1]) {
			minmax.min = arr[0];
			minmax.max = arr[1];
		}else {
			minmax.min = arr[1];
			minmax.max = arr[0];
		}		
		
		for( i = 2; i < n; i++) {
			if(arr[i] > minmax.max) {
				minmax.max = arr[i];
			}else if (arr[i]< minmax.min) {
				minmax.min = arr[i];
			}
		}
		return minmax;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array - ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array values ");
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		Pair minmax = getMinMax(arr, size);
		System.out.printf("\nMinimum element is - %d", minmax.min);
		System.out.printf("\nMaximum element is - %d", minmax.max);
	}
}
