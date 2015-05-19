import java.util.Scanner;


public class Keyboard {
	public static String []  s = {null,"vtfrq","ftk","wzbg","rs",null,"fir","p","lo","p"};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       int num;
	       System.out.print("Enter a number: ");
	       num = in.nextInt();
	       Combination("",Integer.toString(num));	// TODO Auto-generated method stub

	}
	
	
	public static void Combination(String prefix, String num )
    {
        
        if(num.length()==0)
        {
            System.out.println(prefix);
         return;   
        }
        else
        {
                
                int x = Integer.parseInt(num.charAt(0)+"");
                String temp = new String();
                temp = s[x];
                if(temp!=null)
                {
                    for(int j=0;j<temp.length();j++)
                    {
                         Combination(prefix+temp.charAt(j),num.substring(1,num.length()));
                    } 
                }
                else
                    Combination(prefix,num.substring(1, num.length()));         
        }
    }

}
