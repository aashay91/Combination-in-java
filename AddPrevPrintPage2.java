
public class AddPrevPrintPage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1";
		for(int i=0;i<=10;i++)
		{
			System.out.println(str);
			str=print(str);
		}

	}

	public static String print(String s)
	{
		StringBuilder bld=new StringBuilder();
		int len=s.length();
		int cnt=1;
		for(int i=0;i<len;i++)
		{
			char c=s.charAt(i);

			while(i<len)
			{
				if(i+1<len)
				{
					if(s.charAt(i)==s.charAt(i+1))
					{

						cnt++;
					}
					else
					{
						bld.append(cnt);
						bld.append(c);
						break;
					}

					i++;
				}
				else
				{
					bld.append(cnt);
					bld.append(c);
					break;
				}
			}
			cnt=1;

		}


		return bld.toString();
	}

}
