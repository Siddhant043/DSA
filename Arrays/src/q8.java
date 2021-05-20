//Kadane's algorithm (time complexity = O(n))
public class q8 {
	static int largestSum(int arr[]) {
		int maxsum = 0;
		int cursum = 0;
		int n = arr.length;
		for (int i=0; i<n; i++) {
			cursum = cursum + arr[i];
			if(cursum>maxsum) {
				maxsum = cursum;
			}
			if(cursum < 0) {
				cursum = 0;
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int arr[] = { 5, -4, -2, 6, -1};
		int maxsum = largestSum(arr);
		System.out.print("Largest Sum Contiguous Array - " + maxsum);		
	}

}
