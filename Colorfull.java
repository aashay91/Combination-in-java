import java.util.*;
public class Colorfull {

	List<Integer>prod=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iscolor(3245);

	}

	public static void iscolor(int num)
	{
		String str=Integer.toString(num);
		int len=str.length();
		int []dig=new int[len];
		for(int i=0;i<len;i++)
		{
			dig[i]=Character.getNumericValue(str.charAt(i));

		}

		int j=1;
		int offset=0;
		int rn;
		while(j<len)
		{
			int prd=1;
			int k=0;
			offset=0;
			while(j+offset<=len)
			{
				prd=1;
				k=0;
				rn=offset;
				while(k<j)
				{
					System.out.println(dig[rn]);
					prd=prd*dig[rn];	
					k++;
					rn++;
				}
				System.out.println(prd);
				System.out.println("---------------");
				
				offset++;

			}


			j++;
		}


	}
}
