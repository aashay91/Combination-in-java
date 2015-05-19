
public class PhoneNumb {


	private static String digits = "123456789";
	private static int numLength;
	public static int count;

	public static void main(String[] args) {
//for(int i=1;i<5;i++)
		printPhoneNums(3);


		
		
	}
	public static void printPhoneNums(int length)
	{
		numLength = length;
		printPhoneNums("");
	}
	private static void printPhoneNums(String prefix)
	{
		if(prefix.length() == numLength)
		{
			count++;
			System.out.println(count+" "+prefix);
			return;
		}
		
		for(int i = 0; i < digits.length(); i++)
		{
			/*
			if(prefix.length() > 0)
			{
				if(prefix.charAt(prefix.length()-1) == digits.charAt(i))
					continue;
				if(prefix.length() > 0 && digits.charAt(i) == '4' && prefix.charAt(0) != '4')
					continue;
			}
			*/
			if(prefix.indexOf(digits.charAt(i))==-1)
			{
			
			printPhoneNums(prefix + digits.charAt(i));
			
			}
		}
	}

}
