package com.hdfcbank.loans.homeloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("iam overriden m2 in ChildClass");
	}

}
