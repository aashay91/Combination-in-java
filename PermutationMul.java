import java.util.*;


public class PermutationMul {

	public static Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
	static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print_combinations("1234");
	
		String s="1234";

		
	
		//for(int i=1;i<=s.length();i++)
		combinations2(s,3,0,new String[3]);
		/*
		if(flag==false)
			System.out.println("not coloer");
		else
		*/	System.out.println(mp);
	}
	
	static void combinations2(String arr, int len, int startPosition, String[] result){
      
		if (len == 0){
        	int xx=1;
        	/*
        	for(int j=0;j<result.length;j++)
        	{
        	xx=xx*Integer.parseInt(result[j]);
        	}
        	*/
        //  if(false==mp.containsKey(xx))
          {
            System.out.println(Arrays.toString(result)+""+xx);
            mp.put(xx, xx);
          //  return;
          }
         //flag=false; 
          
        return; 
           
        }       
        for (int i = startPosition;i <= arr.length()-len; i++){
            result[result.length - len] = Character.toString(arr.charAt(i));
            combinations2(arr, len-1, i+1, result);
        }
    }       

	
	

	

}
