
public class q15 {
	private static int[] nextPermutation(int[] nums) {
		 if(nums==null || nums.length <=1) return null;
	        int i = nums.length-2;
	        while(i>=0 && nums[i] >= nums[i+1]) i--;
	        if(i>=0){
	            int j = nums.length-1;
	            while(nums[j] <= nums[i]) j--;
	            swap(nums, i, j);
	        }
	        reverse(nums, i+1, nums.length-1);
	        return nums;
	    }
	 public static void swap(int []nums, int i, int j){
	        int tmp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = tmp;
	    }
	    public static void reverse(int []nums, int i, int j){
	        while(i<j) swap(nums, i++, j--);
	    }
	    
	    private static void display(int[] nums) {
	    	for(int i=0;i<nums.length;i++) {
	    		System.out.print(nums[i]);
	    	}
	    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,4,2};
		display(nextPermutation(nums));
	}
}
