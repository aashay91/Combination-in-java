import java.util.*;
public class ConsNumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 print(1000,2000);
		
		
	}
	public static void print(int min,int max)
	{
		int temp=min;
		
		
	
	
		while(temp<=max)
		{
			String s=Integer.toString(temp);
			int len=s.length();
			int[]x= new int [len];
			for(int i=0;i<len;i++)
			{
				x[i]=Character.getNumericValue(s.charAt(i));
			}
			for(int i=0;i<len-2;i++)
			{
				if(x[i]==x[i+1])
				{
					int y=x[i]*2;
					if(y==x[i+2])
						System.out.println(temp);
					break;
				}
			}
			
			
			temp++;
		}
	}

}
