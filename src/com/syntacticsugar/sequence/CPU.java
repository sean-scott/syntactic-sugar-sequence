package com.syntacticsugar.sequence;

public class CPU extends Player {
	
	private Card[] CPUhand;
	
	/*CPU keeps track of a finite number of cards played (trying to keep it as human as possible)*/
	private Card[] playedCards_P = new Card[15];
	private Card[] playedCards_C = new Card[30];
	private int numCards_P, numCards_C;
	
	public CPU(Card[] hand){
		
		super(hand);
		CPUhand = hand;
		numCards_P = 0;
		numCards_C = 0;
	}
	
	public CPU(){

	}
	
	
	//Mutator to add a recently played card to the respective array
	//The CPU will only remember the 15 most recently played cards
	public void rememberCard_P(Card c){
		if(numCards_P == 15){
			numCards_P = 0;
			playedCards_P[numCards_P] = c;
		}else{
			playedCards_P[numCards_P] = c;
			numCards_P ++;
		}
	}
	
	public void rememberCard_C (Card c){
		if(numCards_C == 30){
			numCards_C = 0;
			playedCards_P[numCards_C] = c;
		}else{
			playedCards_P[numCards_C] = c;
			numCards_C ++;
		}
	}
	
	public void turn()
	{
		
	}

}
































// fuck you