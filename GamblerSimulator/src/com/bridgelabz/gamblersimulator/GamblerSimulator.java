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
	public static boolean terminalCondition(int stake) {
		if(stake > (INITIAL_STAKE/2) || stake < (INITIAL_STAKE+(INITIAL_STAKE/2)))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to gambler simulator");
		int stake = INITIAL_STAKE;
		stake = playGame(stake);
		boolean continueToPlay = terminalCondition(stake);
		if(continueToPlay==true)
			System.out.println("limit has reached for the day");
		else
			System.out.println("player can continue to play");
	}

}
