package com.demo.design.bridge;

public class CashPayment implements PaymentSystem{
	
	@Override
	public int getCurrentAmount(){
		System.out.println("The customer paid the current amount in cash");
		return 100;
	}

	@Override
	public int getTotal() {
		System.out.println("This is the total amount for the day in cash.");
		return 1000;
	}

}
