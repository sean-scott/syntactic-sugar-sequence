package com.syntacticsugar.sequence;

import java.util.Random;

public class Player {
	
	Card[] hand = new Card[6];
	
	public Player(Card[] hand){
		
		this.hand = hand;
		
		
		
		
	}
	
	public Player(){
		
		
		
	}
	
	public Card selectCard(int index){
		return hand[index]; //Best I could do
	}
	
	public void removeCard(int index){
		hand[index].setName("null"); //Follows same principal as deck's remove method
	}
	

	public void drawCard(){ 
		
		Random rand = new Random(System.currentTimeMillis());
 		
 		int min = 0; int max = 107;
 		
 		//Will find the removed card and replace it with a random card from the deck
		for(int j = 0; j < 6; j++){ 
			if(hand[j].getName() == "null"){ 
				
				int randomCard = rand.nextInt(max + 1) + min;
				
				//Copied from the generate hand method to pull from the deck
	 			if (!Deck.deck[randomCard].getName().equals("null")){
	 				hand[j] = Deck.deck[randomCard];
	 				removeCard(randomCard);
	 			}
			}
		}
	}
	
	// hellowwwww... I hit my elbow

}
