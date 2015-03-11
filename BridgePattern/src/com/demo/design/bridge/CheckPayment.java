package com.demo.design.bridge;

public class CheckPayment implements PaymentSystem{

	@Override
	public int getCurrentAmount(){
		System.out.println("The customer paid the current amount in check");
		return 50;
	}

	@Override
	public int getTotal() {
		System.out.println("This is the total amount for the day in check");
		return 1500;
	}


}
