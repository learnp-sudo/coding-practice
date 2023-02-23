package demo;

public class Demo2 {

	public static void main(String[] args) {
     int p=-2 , n=3;
   double result=1;

     result=Math.pow(p, n);
     System.out.println(result);
     result=1;
     for(;n!=0;)
     {
    	 if(n<0)
    	 {
    	result=result*1/p;
    	n++;
    	 }
    	 else
    	 {
        result=result*p;
        n--;
    	 }
    		 }     
System.out.println(result);
	}
	
	}


