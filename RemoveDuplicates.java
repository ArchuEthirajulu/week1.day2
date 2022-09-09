package week1.day2;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "my name name is suja";
     String [] split = text.split(" ");
     for(int i=0 ; i<split.length; i++) {
    	 int count =0 ;
    	 
    	 for (int j= i+1; j<split.length; j++) {
    		 if(split[i]. equals (split[j])) {
    		 count++ ;
    	 }
    	 }
   
     if (count>=1) {
    	 split[i] ="" ;
     }
     }
     for(int s=0 ; s<split.length; s++) {
  
    	 System.out.print(split[s] + " ");
    		 
    			 
    	 }

     }
	}

