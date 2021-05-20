public class arrayReverse{
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		if(start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray(arr, start+1, end-1);
		}
	}
	static void printArray(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		int arr[] = {5, 4, 3, 2, 1};
		printArray(arr);
		reverseArray(arr, 0, 4);
		System.out.print("Reversed array is- \n");
		printArray(arr);
	}
}