package Basic;

public class BankAxis implements Bank{
static int r=9;
double axisInterest=0;
@Override
public void getRateOfInterest(int p, int t) {
	// TODO Auto-generated method stub
	axisInterest=(p*t*r)/100;
	System.out.println("Axis Bank rate of interest is "+axisInterest+"%");
}
}
