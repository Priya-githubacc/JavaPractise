package basic;

public class Prime {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

		// TODO Auto-generated method stub
         //   int x=83;
           int flag=0;
           int ii=0;
           for(int i=2; i<x.length;i++) {
        	   
        	   if(x[ii]%i==0) {
        		   flag=1;
        		   break;
        	   }
        	   ii++;
        	   
           }
           
           if(flag==0) {
        	   System.out.println(x[ii]+" --- > Is a prime");
           }else {
        	   System.out.println(x[ii]+" --- > Not a prime");
           }
	
	}

}
