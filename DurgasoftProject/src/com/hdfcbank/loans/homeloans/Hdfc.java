package com.hdfcbank.loans.homeloans;

public class Hdfc  implements Rbi {
public static void main(String[] args) {
	Hdfc obj=new Hdfc();
	obj.withdrawl();
	obj.deposit();
	
}

@Override
public void withdrawl() {
	// TODO Auto-generated method stub
	System.out.println("iam overrideen withdrawl in Hdfc");
}

@Override
public void deposit() {
	// TODO Auto-generated method stub
	System.out.println("iam overrideen deposit in Hdfc");
	
}
}
