package com.xworkz.abstractClass.BankExample;

public class TestBank {

	public static void main(String[] args) {
		 Bank b = new SBI();
		 System.out.println("Rate of intrest in SBI :" +b.getRateOfIntrest()+ "%");
		 Bank b1 = new HDFC();
		 System.out.println("Rate of intrest in HDFC :" +b1.getRateOfIntrest()+ "%");
		 

	}

}
