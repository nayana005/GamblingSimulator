package com.bl.gambling;

public class StackPrice {
	double stake = 100;
	int betPrice = 1;

	public void display () {
		System.out.println("Stake is:" + stake);
		System.out.println("Bet price:" + betPrice);
	}

	public static void main(String[] args) {

		System.out.println("Gambler simulation program");
		StackPrice gambler = new StackPrice();
		gambler.display();
	}


}
