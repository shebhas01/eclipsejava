package com.methodoverriding;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc=new HDFC();
		float interestRate=hdfc.getInterestRate();
		System.out.println("Interest rate of HDFC is:"+ interestRate);
		
		
		Axis axis=new Axis();
		float interestRate1=axis.getInterestRate();
		System.out.println("Interest rate of Axis is:"+ interestRate1);

	}

}
