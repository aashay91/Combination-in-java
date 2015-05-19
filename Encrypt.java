
public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
strg("ABCZ",4);
		/*
int []cc=new int[256];
char c='B';

cc[c]=1;
int xx='B';
System.out.println(cc[67]);
*/


	}
	public static void strg(String str,int n)
	{
		StringBuilder sb=new StringBuilder();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			c=(char)(c-'A');
			int x=c;
			x++;
			//System.out.println();
			x=x*n;
			//System.out.println(x);
			if(x<=26)
				
				sb.append(x);
			else
			{
				x=x%26;
				sb.append(x);
				
			}
				
		}
		
		System.out.println(sb.length()+" "+sb);
	}

}
