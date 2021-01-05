
public class sort012 {
 static void dsort(int arr[]) {
	 int low, mid, high, temp;
	 low = 0;
	 mid = 0;
	 high = arr.length - 1;
	 
	 while(mid <= high ) {
		 switch (arr[mid]) {
		 case 0: {
			 temp = arr[low];
			 arr[low] = arr[mid];
			 arr[mid] = temp;
			 low++;
			 mid++;
			 break;
		 }
		 case 1: {
			 mid++;
			 break;
		 }
		 case 2: {
			 temp = arr[mid];
			 arr[mid] = arr[high];
			 arr[high] = temp;
			 high--;
		 }
		 }
	 }
 }
 public static void main(String[] args) {
	 int arr[] = {2,1,1,1,0,2};
	 dsort(arr);
	 System.out.println("Sorted array - ");
	 for (int i = 0; i < arr.length; i++) {
		 System.out.print(arr[i]);
	 }
	 
 }
}
