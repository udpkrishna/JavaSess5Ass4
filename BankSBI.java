package Basic;

public class BankSBI implements Bank{
	static int r=8;
	double sbiInterest=0;
	
	@Override
	public void getRateOfInterest(int p, int t) {
		// TODO Auto-generated method stub
		sbiInterest=(p*t*r)/100;
		System.out.println("SBI Bank rate of interest is "+sbiInterest+"%");
	}

}
