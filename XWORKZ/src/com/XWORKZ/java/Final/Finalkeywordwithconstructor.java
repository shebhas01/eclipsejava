package com.XWORKZ.java.Final;



public class Finalkeywordwithconstructor {
	final int x;
	final static int y=200; 
	Finalkeywordwithconstructor(int value){
		x=value;
		
		
	}
	Finalkeywordwithconstructor(){
		x=300;
	}
	public static void main(String[] arg) {
		Finalkeywordwithconstructor fkwc=new Finalkeywordwithconstructor(100);
		System.out.println("x:"+fkwc.x);
		System.out.println("y:"+fkwc.y);
		Finalkeywordwithconstructor fkwc1=new Finalkeywordwithconstructor(300);
		System.out.println("x:"+fkwc1.x);
		
		
		

		Finalkeywordwithconstructor fkwc2=new Finalkeywordwithconstructor(400);
		System.out.println("x:"+fkwc2.x);
		Finalkeywordwithconstructor fkwc3=new Finalkeywordwithconstructor(400);
		System.out.println("x:"+fkwc3.x);

		

		
	}
}
