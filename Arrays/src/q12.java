
public class q12 {
	//function to find next gap
	private static int nextGap(int gap) {
		if(gap <= 1)
			return 0;
		return (gap/2) + (gap%2);
	}
	public static void merge(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int gap = m + n, i, j;
		for(gap=nextGap(gap); gap>0; gap=nextGap(gap)) {
			//comparing elements in the firse array
			for(i=0; i+gap < n; i++)
				if(arr1[i]> arr1[i+gap]) {
					int temp = arr1[i];
					arr1[i] = arr1[i+gap];
					arr1[i+gap] = temp;
				}
			// comparing elements in both the arrays
			for(j=gap>n ? gap-n : 0; i<n && j<m; i++, j++) 
				if(arr1[i] > arr2[j]) {
					int temp=arr1[i];
					arr1[i]=arr2[j];
					arr2[j]=temp;
				}
			//comparing elements in second array
			if(j<m) {
			for(j=0; j+gap<m; j++)
				if(arr2[j]> arr2[j+gap]) {
					int temp=arr2[j];
					arr2[j]=arr2[j+gap];
					arr2[j+gap]=temp;
				}
			}
		}
	}
	
	public static void display (int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {4,5,7,9,11,33};
		int arr2[] = {2,8,16};
		merge(arr1, arr2);
		display(arr1);
		display(arr2);
	}
}
