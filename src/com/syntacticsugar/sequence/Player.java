package com.syntacticsugar.sequence;

import javax.swing.*;

import java.awt.Color;
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
		hand[index] = null; //Follows same principal as deck's remove method
	}
	
	public int indexOf(BoardCard bc){
		
		for (int i=0; i < hand.length; i++){
			
			if (hand[i].equals(bc)){
				
				return i;
		
			}
		}
		
		
		return 0;
		
	}

	public Card[] drawCard(int index)
	{ 
		Random rand = new Random(System.currentTimeMillis());
 		
 		int min = 0; int max = 107;
 		
 		// Replace removed card with a random card from the deck
	 	hand[index] = Deck.deck[rand.nextInt(max + 1) + min];
	 	
	 	removeAll();
	 	//remove(hand[index]);
	 	
	 	System.out.println("Your hand is now: ");
	 	
	 	for (int i = 0; i < 6; i++)
	 	{
	 		add(hand[i]);
	 		
	 		hand[i].printCard();
	 	}
	 	
	 	revalidate();
	 	repaint();	
	 	
	 	return hand;
	}
}
