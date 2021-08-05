
public class q11 {
	public static int findDuplicate(int nums[]) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while(slow != fast);
		fast = nums[0];
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,3};
		int dupNum = findDuplicate(arr);
		System.out.println(dupNum);
	}

}
