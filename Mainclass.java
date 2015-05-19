import java.util.HashMap;
import java.util.Map;


public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,Bnk1> md=new HashMap<Integer,Bnk1>();
Bnk1 k=new Check1 ();
k.balance=(double) 12;
k.AccType="checking";
md.put(1, k);
Bnk1 k1=new Save ();
k1.balance=(double) 154863;
k1.AccType="saving";
md.put(2,k1);

Bnk1 b=md.get(1);
Double d=b.balance;
System.out.println(d);
System.out.println(b.interest(d));

	}

}
