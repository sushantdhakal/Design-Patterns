package com.demo.design.app;

import com.demo.design.bridge.CashPayment;
import com.demo.design.bridge.Payment;



public class Main {
	
	public static void main(String[]args){
		Payment p = new Payment(new CashPayment());	
		p.total();
	}

}
