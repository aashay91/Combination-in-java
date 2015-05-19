

public class GramAnagra {

public static 	void main(String []args)
	{
	
	        StringBuilder a = new StringBuilder();
	        a.append("ACADBB123");
	        StringBuilder b = new StringBuilder();
	        b.append("DC1BA32BA");
	        char temp;
	        int n = b.length();
	        int j, i = 0;
	        while(n > i) {
	                        j = i;
	                        System.out.println(a);
	                        while(a.charAt(j) != b.charAt(i)) {
	                                j++;
	                        }
	                        while(j > i) {
	                        	
	                                temp = a.charAt(j);
	                                a.setCharAt(j,a.charAt(j-1));
	                                a.setCharAt(j-1,temp);
	                                
	                                System.out.println("-------------------");
	                                System.out.println(a);
	                                System.out.println("-------------------");
	                                j--;
	                        }
	                        i++;
	        }
	}

}
