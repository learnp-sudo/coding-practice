package demo.program;

public class MaxandMinOfArray {
	public static void main(String args[]) {
//		N = 6
//	   A[] = {3, 2, 1, 56, 10000, 167}
//	 Output:
//	 min = 1, max =  10000
	int	A[]= {3,2,1,56,10000,167};
	int	max=A[0];
	int min=A[0];
	for(int i=0;i<A.length;i++) {

		if(A[i]>max) {
			max=A[i];
		}
		if(A[i]<min) {
			min=A[i];
		}

	}
	System.out.println(max);
	System.out.println(min);



	}
	}
