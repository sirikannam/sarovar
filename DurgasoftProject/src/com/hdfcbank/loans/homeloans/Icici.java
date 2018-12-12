package com.hdfcbank.loans.homeloans;

public class Icici implements Rbi

{

	public static void main(String[] args)
	{
	
            Icici obj=new Icici();
            obj.withdrawl();
            obj.deposit();
 
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam overridden withdrawl in Icici");
		
	}

	@Override
	public void deposit() 
	{
	System.out.println("iam overridden deposit in Icici");
	
		
	}

}
