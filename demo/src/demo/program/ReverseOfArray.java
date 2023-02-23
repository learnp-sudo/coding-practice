package demo.program;

public class ReverseOfArray {

	public static void main(String[] args) {
//		Input  : arr[] = {1, 2, 3}
//		Output : arr[] = {3, 2, 1}

		int arr[] = {1, 2, 3};
		int n=arr.length;
		System.out.println("original Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Reverse Array");
		for(int i=n-1;i>=0;i--){
		System.out.print(arr[i]);
		}

	}

}
