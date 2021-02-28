public class cyclicroation {
	
	private static void cycrotate(int [] arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		display(arr);
	}
	
	private static void display(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5};
		cycrotate(array);
	}

}
