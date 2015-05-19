

	public class GenNoRiBig {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			GenNoRiBig numbers=new GenNoRiBig();
			
			numbers.printNumbers(3);

	                //numbers.printNumbers(5);
		}
		
		
	    public void printNumbers(int n){
	    	int[] a={1,2,3,4,5,6,7,8,9};
	    	
	    	subPrint("",0,n,a);
	    	
	    }
	    
	    private void subPrint(String preFix,int startIndex,int numberCount,int[] a){
	    	
	    	for(int i=startIndex;i<a.length;i++){
	    		
	    		int digit=a[i];
	    		
	    		if(numberCount==1){
	    			System.out.println(preFix+digit);
	    		}else{
	    			subPrint(preFix+digit,digit,numberCount-1,a);
	    		}
	    		
	    	}
	    }
	}


