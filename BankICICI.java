package Basic;

public class BankICICI implements Bank{
	static int r=7;
	double iciciInterest=0;
	@Override
	public void getRateOfInterest(int p, int t) {
		// TODO Auto-generated method stub
		iciciInterest=(p*t*r)/100;
		System.out.println("ICICI Bank rate of interest is "+iciciInterest+"%");
		
	}

}
