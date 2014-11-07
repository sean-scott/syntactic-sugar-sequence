package com.syntacticsugar.sequence;

import javax.swing.*;

import java.util.Random;

public class Player extends JPanel 
{
	Card[] hand = new Card[6];
	
	public Player(Card[] hand){
		
		this.hand = hand;
		
		for (int i = 0; i < 6; i++)
		{
			this.add(hand[i]);
		}
	}
	
	public Player()
	{	
	}
	/* Card is selected from Card.java. This may need to be modified to un-highlight other cards
	public void selectCard()
	{	
		for (int i = 0; i < 6; i++)
		{
			if (hand[i].selected)
			{
				System.out.println(i);
			}
			
			else
			{
				System.out.println(i);
				hand[i].selected = false;
			}
		}
	}
	*/
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
