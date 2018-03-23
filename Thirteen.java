
public class Thirteen {
	public static void main(String[] args) {
		 int a[][]=new int[6][6], b, c;
	     for (b=0;b<a.length/2+1;b++){
	    	 for (c=0;c<a[b].length;c++){ 	    		 	    		 
	    		 if ((c<b) || (c>=(a[b].length-b))) 	    			 
	    			 a[b][c]=0;
	    		 else a[b][c]=1;
	    	 	}     
	        }
	        for (b=a.length-1; b>=a.length/2; b--){
	              for (c=0; c<a[b].length; c++){
	                if ((c<(a[b].length-1-b)) || (c>b))
	                  a[b][c]=0;
	                else a[b][c]=1;
	              }
	        }
	        for (b=0;b<a.length;b++){
	            for(c=0;c<a[b].length;c++){
	                System.out.print(a[b][c]);
	            }
	            System.out.println();
	        }
	     }    
}