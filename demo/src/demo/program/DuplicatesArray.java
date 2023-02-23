package demo.program;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
//		Output: 1, 3, 6
		int arr[] = {1, 2, 3, 6, 4,3, 6, 1};
				 for(int i = 0; i < arr.length; i++) {
			 int count=0;
	            for(int j = i + 1; j < arr.length; j++) {
	                if(arr[i] == arr[j])
	                  count++;
	            }
	            if(count>0)
	            {
	            	 System.out.println(arr[i]);
	            }
	        }
	}

}
