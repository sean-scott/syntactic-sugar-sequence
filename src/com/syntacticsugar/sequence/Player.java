package com.syntacticsugar.sequence;

import javax.swing.*;

import java.awt.Color;
import java.util.*;
import java.util.Random;

public class Player extends JPanel 
{
	List<Card> handList = new ArrayList<Card>();
	
	public Player(Card[] hand)
	{
		makeHand(hand);
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
	
	public void removeCard(int index)
	{
		//hand[index] = null; //Follows same principal as deck's remove method
	}
	
	public int indexOf(BoardCard bc)
	{
		for (int i=0; i < 6; i++)
		{	
			if (handList.get(i).equals(bc))
			{
				return i;
			}
		}
		
		return 0;
	}

	public void drawCard(int index)
	{ 
		/***** LOGIC *****/
		
		Random rand = new Random(System.currentTimeMillis());
 		
 		int min = 0; int max = 107;
 		
 		// Switch used card out with a new random Card from Deck
 		handList.set(index, Deck.deck[rand.nextInt(max + 1) + min]);
 		
 		/***** GUI *****/
 		
	 	removeAll();
	 
	 	for (int i = 0; i < 6; i++)
	 	{
	 		add(handList.get(i));
	 	}
	 	
	 	revalidate();
	 	repaint();	
	}
}
