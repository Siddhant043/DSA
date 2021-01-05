
public class negToOneSide2 {
 static void arrangeArr(int arr[], int size) {
	 int i = -1;
	 int pivot = 0;
	 int j, temp;
	 for(j=0; j<size; j++) {
		 if(arr[j]< pivot) {
			 i++;
			 temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
		 }
	 }
 }
 public static void main(String[] args) {
	 int arr[] = {9, 8, -4, 99, -13,-93};
	 int size = arr.length;
	 arrangeArr(arr, size);
	 System.out.println("Rearranged array is - ");
	 for(int i = 0; i < size; i++) {
		 System.out.print(arr[i]);
	 }
 }
}
