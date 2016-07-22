package Basic;

import java.util.Scanner;

public class TestBankROI {
static int p=0;
static int t=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the principal: ");
		p=read.nextInt();
		
		Scanner read1=new Scanner(System.in);
		System.out.println("Enter the time: ");
		t=read1.nextInt();
		
		BankAxis a1=new BankAxis();
		a1.getRateOfInterest(p, t);
		
		BankICICI i1=new BankICICI();
		i1.getRateOfInterest(p, t);
		
		BankSBI s1=new BankSBI();
		s1.getRateOfInterest(p, t);

	}

}
