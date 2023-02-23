package demo.program;

public class AmstrongNumber {
	public static void main(String args[]) {
		int num,sum,temp;

		for(int i=1;i<=200;i++) {

			 num=i;
			 temp = num;
			 sum=0;
		while(num!=0) {
			int nu=num%10;

			sum=sum+(nu*nu*nu);

			num=num/10;

		}
		if(temp==sum) {
			System.out.println(temp);
		}

//		else
//			   System.out.println("not amstrong");
	}
	}

}
