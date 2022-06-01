package com.bl.gambling;

public class NumOfPlay {
	double stake = 100;
	int betPrice = 1;
	int numberOfplay = 0;
	int numberOfwin = 0;
	int numberOfLoss = 0;
	double goal = 150;

	public static boolean winOrLoss() {
		if(Math.random() > 0.5)
			return true;
		else 
			return false;
	}
	public void play() {
		numberOfplay++;
		if (winOrLoss()) {
			stake += betPrice;
			stake = stake/2;
			numberOfwin++;
		}	
		else {
			stake -= betPrice;
			stake = stake/2;
			numberOfLoss++;
		}	
		if (stake <= 0 || stake >= goal)
			return;
		else
			play();
	}
	public void display () {
		System.out.println("Number of time Game play is:" + numberOfplay);
		System.out.println("Stake is:" + stake);
		System.out.println("Bet price:" + betPrice);
		System.out.println("Goal is:" + goal);
		System.out.println("Number of wins:" + numberOfwin);
		System.out.println("Number of Loss:" + numberOfLoss);
	}

	public static void main(String[] args) {

		System.out.println("Gambler simulation program");
		winOrLoss();
		System.out.println(winOrLoss());
		NumOfPlay gambler = new NumOfPlay();
		gambler.play();
		gambler.display();
	}

}
