import java.util.*;
public class SqaureRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number to find the squareroot");
		Scanner scan = new Scanner(System.in);
		double num=	Double.parseDouble(scan.next());
		//double num =Integer.parseInt(scan.next());
		double x= num;
		double y = (0.5)*(x +(num/x));
		System.out.println(y);
		while(x!=y)
		{
			x = y;
			y= (0.5)*(x +(num/x));
			System.out.println(y);
		}
		System.out.println("Final squareroot of "+num+" ----> "+y);
		
		
		
	}

}
