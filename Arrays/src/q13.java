
public class q13 {
	private static int maxSum(int arr[]) {
		int sum=0;
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			max=Math.max(sum, max);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,4,-1,4,-6,3,5,-3};
		System.out.println("Maximum sub array sum - "+ maxSum(arr));
	}
}
