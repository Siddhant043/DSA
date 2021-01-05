
public class negToOneSide {
 static void arrangeArr(int arr[], int size) {
	 int j = 0, temp;
	 for(int i=0; i<size; i++) {
		 if(arr[i] < 0) {
			 if( i!=j) {
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }	
			 j++;
		 }
	 }
 }
 public static void main(String[] args) {
	 int arr[] = {-19, 12, 100, -66, 44, -7, -1, -6, 78};
	 int size = arr.length;
	 arrangeArr(arr, size);
	 System.out.println("Arranged Array is - ");
	 for(int i=0; i<size; i++) {
		 System.out.print(arr[i]);
	 }
 }
 
}
