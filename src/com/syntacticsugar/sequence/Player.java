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
		System.out.print("Removed card:");
		System.out.println(Deck.deck.set(index, null)); //Removes the card from the Deck list
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
 		
 		int min = 0; int max = Deck.deck.size()-1; int randIndex; boolean canBePicked = true;
 		
 		// Switch used card out with a new random Card from Deck
 		

 			randIndex = rand.nextInt(max + 1) + min;

 				handList.set(index, Deck.deck.get(randIndex));
 				canBePicked = false;
 		
 		
 		/***** GUI *****/
 		
	 	removeAll();
	 
	 	for (int i = 0; i < 6; i++)
	 	{
	 		add(handList.get(i));
	 	}
	 	
	 	//removeCard(randIndex); //Why doesn't this shit work
	 	
	 	revalidate();
	 	repaint();	
	 	
	 	System.out.println("SIZE: " + Deck.deck.size());

	 	
	 	
	 	
	}
}
