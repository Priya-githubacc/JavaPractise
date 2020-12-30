package arrays;

public class BobbleSort {

	public static void main(String[] args) {

    int[] a= {12,22,9,77}; 
    
    
  
     for(int i=0; i<=a.length-1; i++) {
    	
    		 int temp, j=0;
    		 temp=a[i];
    		 a[i]=a[j];
    		 a[j]=temp;
    	    	System.out.println(a[j]);

    	    	j++;
    	 }
    	 
    
	}
	}

