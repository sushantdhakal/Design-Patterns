package com.demo.design.bridge;

public class Payment {
	PaymentSystem p;
	
	public Payment(PaymentSystem p){
		this.p = p;
	}
	
	public void total(){
		p.getTotal();
	}
	
}
