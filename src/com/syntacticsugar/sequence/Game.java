package com.syntacticsugar.sequence;
import java.awt.GridLayout;




import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game 
{
	// GUI Elements
	
	public static JFrame f = new JFrame("Sequence!");
	public static Board b = new Board();
	public static Deck d = new Deck();
	public static Player p = new Player();

	public static int turnIndex = 0;
	public static boolean isWild = false;
	
	// Pick card from Hand
	
	public static void findCard(int index)
	{
		// Initialize new Deck to make compiler happy
		Deck myD = new Deck();
		
		// Find the two spots on the Board where the chosen card is
		int spots[][] = Board.indexOf(myD.deck[index]);
 		
 		// Simplifying spots[][]
 		int first[] = new int[2]; // location of first card
 		int second[] = new int[2]; // location of second card
 		
 		first[0] = spots[0][0];
 		first[1] = spots[0][1];
 		
 		second[0] = spots[1][0];
 		second[1] = spots[1][1];

 		// Function to mark the cards on the Board
 		Card c = myD.deck[index];
 		markCard(c, first, second);
	}
	
	public static void enableDeck()
	{
		for (int i = 0; i < d.deck.length; i++)
		{
			int x = i;
			
			d.deck[i].addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					int index = x;

					findCard(index);
				}
			});
		}
	}
	
	public static void updateBoard()
	{
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				int x = i;
				int y = j;
				
				b.board[i][j].addActionListener(new ActionListener()
				{
					// A BoardCard was selected
					
					@Override
					public void actionPerformed(ActionEvent e) 
					{	
						System.out.println("Action performed");
						
						// Highlight selected BoardCard
						
						b.board[x][y].highlight();
						
						// Get index of selected BoardCard to replace card from hand
						
						int index = 0;
						
						if (isWild)
						{
							// Find Jack
							
							for (int i = 0; i < 6; i++)
							{
								if (p.handList.get(i).getName().equals("J"))
								{
									index = i;
								}
							}
						}
						
						else
						{
							index = p.indexOf(b.board[x][y]);
						}
						
						System.out.println("Index returned: " + index);
						
						// Draw new card from deck, replaces selected card from hand
						// Should update GUI from within function
						p.drawCard(index);
						
						// Prevent user from selecting another card
						unmarkAll();
						
						// Setup the computer's turn
			            getTurn(e);
					}
				});
			}
		}
	}
	
	public static void markCard(Card c, int[] first, int [] second)
	{
 		// Select any card with Jack
 		if (c.getName().equals("J"))
 		{
 			isWild = true;
 			
 			for (int i = 0; i < 10; i++)
 			{
 				for (int j = 0; j < 10; j++)
 				{
 					if (!b.board[i][j].highlighted)
 					{
 						b.board[i][j].mark();
 					}
 				}
 			}
 		}
 		
 		// Any card that isn't a Jack (just show that specific card)
 		else
 		{
 			isWild = false;
 			
 			// Mark the card to make it visually stand out
 			// If already highlighted, don't mark it
 			
 			if (!b.board[first[0]][first[1]].highlighted)
 			{	
 				b.board[first[0]][first[1]].mark();
 			}
 		
 			if (!b.board[second[0]][second[1]].highlighted)
 			{
 				b.board[second[0]][second[1]].mark();
 			}
 			
 			// Unmark anything that is not the 2 BoardCards that match what the card you selected in your hand
 			
 			for (int i = 0; i < 10; i++)
	 		{
	 			for (int j = 0; j < 10; j++)
	 			{
	 				if (!b.board[i][j].equals(b.board[first[0]][first[1]]) || !b.board[i][j].equals(b.board[second[0]][second[1]]))
	 				{
	 					if (b.board[i][j].getName() != "")
	 					{
		 					b.board[i][j].unmark();
	 					}
	 				}
	 			}
	 		}
 		}
		
	}
	
	// Set Board to fully disabled and unmark every card to prevent user selection
	public static void unmarkAll()
	{
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				b.board[i][j].unmark();
				b.board[i][j].setEnabled(false);
			}
		}
	}
	
	// Increment turn index (taken from Board actionListener)
	public static void getTurn(ActionEvent e)
	{
		turnIndex++;
		turnIndex %= 2;
		
		changeTurn(turnIndex);
	}
	
	// Change turn from Human to CPU, vice-versa
	public static void changeTurn(int index)
	{
		if (index == 0)
		{
			System.out.println("Human's turn");
			humanTurn();
		}
		
		else
		{
			System.out.println("Computer's turn");
			computerTurn();
		}
	}
	
	// Update GUI
	public static void humanTurn()
	{
		enableDeck();
	}
	
	// CPU stuff
	public static void computerTurn()
	{
		System.out.println("CPU is done");
		turnIndex++;
		turnIndex %= 2;
		
		changeTurn(turnIndex);
	}
	

	public static void main(String[] args) 
	{
		/***** GUI *****/
		
		// Frame - the main window that holds everything.

		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Board - the 10x10 grid of cards to make a sequence

		b.setLayout(new GridLayout(10,10));
		b.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.GRAY));
		
		
		// Enable ActionListener for Deck (will be called with every Human Turn
		enableDeck();
		
		// Player - the 1x6 grid of cards that show player's current hand
		
		p.makeHand(d.generateHand());
		p.setLayout(new GridLayout(1,6));
		p.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
		
		// Adding everything to Frame
		
		f.add(b);
		f.add(p, BorderLayout.PAGE_END);		
		f.setVisible(true);
		
		// Add ActionListener for every BoardCard - only needs to be called once
		updateBoard();
	}
}