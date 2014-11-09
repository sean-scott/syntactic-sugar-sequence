package com.syntacticsugar.sequence;

import javax.swing.*;

import java.awt.Color;
import java.util.*;
import java.util.Random;

public class Player extends JPanel 
{
	List<Card> handList = new ArrayList<Card>();
	
	public Player(List<Card> hand)
	{
		makeHand(hand);
	}
	
	public Player()
	{	
	}
	
	public void makeHand(List<Card> hand)
	{
		
		for (int i = 0; i < 6; i++)
		{
			handList.add(hand.get(i)); // Populate ArrayList
			this.add(handList.get(i)); // GUI - Paint cards
		}
	}
	
	public void removeCard(int index)
	{
		Deck.deck.remove(index); //Removes the card from the Deck list
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
 		
 		int min = 0; int max = Deck.deck.size(); int randIndex;
 		randIndex = rand.nextInt(max + 1) + min;
 		// Switch used card out with a new random Card from Deck
 		handList.set(index, Deck.deck.get(randIndex));
 		
 		/***** GUI *****/
 		
	 	removeAll();
	 
	 	for (int i = 0; i < 6; i++)
	 	{
	 		add(handList.get(i));
	 	}
	 	
	 	revalidate();
	 	repaint();	
	 	
	 	// Deck.deck.remove(randIndex); Why doesn't this shit work
	 	
	}
}
