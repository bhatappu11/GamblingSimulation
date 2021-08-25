package com.bridgelabz.gamblersimulator;

public class GamblerSimulator {
	public static final int TOTAL_STAKE = 100;
	public static final int BET_PER_GAME = 1;
	
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
		if(stake > (TOTAL_STAKE/2) || stake < (TOTAL_STAKE+(TOTAL_STAKE/2)))
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to gambler simulator");
		int stake = TOTAL_STAKE,numOfDays=20,totalAmount=0;
		stake = playGame(stake);
		for (int day = 1; day <= numOfDays; day++) {
			stake = TOTAL_STAKE;
			boolean continueToPlay = terminalCondition(stake);
			while(continueToPlay == true) {
				double winProbability = Math.random();
				if(winProbability < 0.5) {
					System.out.println("Player has lost the bet");
					stake=stake-1;
				}
				else {
					System.out.println("Player has won the bet");
					stake=stake+1;
				}
				System.out.println("current stake value is: "+stake);
			}
			totalAmount=totalAmount+stake;
		}
		System.out.println("stake at the end of 20 days: "+totalAmount);

	}

}
