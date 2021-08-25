package com.bridgelabz.gamblersimulator;

public class GamblerSimulator {
	public static final int INITIAL_STAKE = 100;
	public static final int BET_VALUE = 1;
	
	public static int playGame(int stake) {
		double winProbability = Math.random();
		if(winProbability>0.5) {
			System.out.println("Player has won the bet");
			return stake=stake+1;
		}
		else {
			System.out.println("Player has lost the bet");
			return stake=stake-1;
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Welcome to gambler simulator");
		int stake = INITIAL_STAKE;
		playGame(stake);
	}

}
