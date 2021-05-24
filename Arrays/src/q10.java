import java.util.*;
public class q10 {
	 static int minimumJumps(int arr[]){
		int n = arr.length;
		int maxR = arr[0];
		int step = arr[0];
		int jump = 1;
		if(n==1) return 0;
		else if(arr[0]==0) return -1;
		else {
			for(int i=1; i<n;i++) {
				if(i==n-1) {
					return jump;
				}
				maxR = Math.max(maxR, i+arr[i]);
				step--;
				if(step==0) {
					jump++;
					if(i>=maxR) {
						return -1;
					}
					step = maxR-i;
				}
			}
		}
		return 1;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,3,5,8,9,2,6,7,6,8,9};
		int minJumps = minimumJumps(arr);
		System.out.println("Minimum steps needed: "+minJumps);
	}

}
