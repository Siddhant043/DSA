import java.util.*;
public class KthMax {
	static int findKthLargest(int arr[], int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i: arr ) {
			minHeap.add(i);
			if(minHeap.size() > k) {
				minHeap.remove();
			}
		}
		
		return minHeap.remove();
	}
	public static void main(String[] agrs) {
		int arr[] = {30, 192, 42, 10, 945, 22};
		int k = 3;
		int result = findKthLargest(arr, k);
		System.out.println(result);
	}
}
