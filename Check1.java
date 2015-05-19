
public class Check1 extends Bnk1 {

	@Override
	double interest(double bal) {
		
		return (bal*11)/100*bal;
	}

}
