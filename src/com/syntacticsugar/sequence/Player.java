package com.syntacticsugar.sequence;

import javax.swing.*;

import java.awt.Color;
import java.util.*;
import java.util.Random;

public class Player extends JPanel 
{
	//Card[] hand = new Card[6];
	List<Card> handList = new ArrayList<Card>();
	
	public Player(Card[] hand){
		
		//this.hand = hand;
		
		for (int i = 0; i < 6; i++)
		{
			handList.add(hand[i]); // Populate ArrayList
			this.add(hand[i]); // GUI - Paint cards
		}
	}
	
	public Player()
	{	
	}
	
	public void makeHand(Card[] hand)
	{
		for (int i = 0; i < 6; i++)
		{
			handList.add(hand[i]); // Populate ArrayList
			this.add(hand[i]); // GUI - Paint cards
		}
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
	public void removeCard(int index)
	{
		//hand[index] = null; //Follows same principal as deck's remove method
	}
	
	public int indexOf(BoardCard bc)
	{
		for (int i=0; i < 6; i++){
			/*
			if (hand[i].equals(bc)){
				
				return i;
		
			}
			*/
			
			if (handList.get(i).equals(bc))
			{
				return i;
			}
		}
		
		return 0;
	}

	public void drawCard(int index)
	{ 
		Random rand = new Random(System.currentTimeMillis());
 		
 		int min = 0; int max = 107;
 		
 		// Replace removed card with a random card from the deck
 		
 		//handList.remove(index);
 		//handList.add(Deck.deck[rand.nextInt(max+1) + min]);
 		
 		handList.set(index, Deck.deck[rand.nextInt(max + 1) + min]);
 		
	 	//hand[index] = Deck.deck[rand.nextInt(max + 1) + min];
	 	
	 	removeAll();
	 	//remove(hand[index]);
	 	
	 	for (int i = 0; i < 6; i++)
	 	{
	 		add(handList.get(i));
	 	}
	 	
	 	revalidate();
	 	repaint();	
	}
}
