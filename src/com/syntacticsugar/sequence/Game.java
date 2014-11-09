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
	public static Player p = new Player(d.generateHand());

	public static int turnIndex = 0;
	
	// Pick card from Hand
	
	public static void updateHand()
	{
		for (int i = 0; i < 6; i++)
		{
			int x = i; // Java doesn't like accessing 'i' from inside ActionListener
			
			p.hand[i].addActionListener(new ActionListener()
			{
				// A card was selected from the hand
				
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					// What index is it?
					
					System.out.println("Index of card in hand: " + x);
					
					// Enable the current cards on the board (if not already highlighted)
					
					// Find the two locations of the BoardCard
					// BoardCard matches the card you clicked from hand
					
					int spots[][] = Board.indexOf(p.hand[x]);
			 		
			 		// Simplifying (or not?)
			 		
			 		int first[] = new int[2]; // location of first card
			 		int second[] = new int[2]; // location of second card
			 		
			 		first[0] = spots[0][0];
			 		first[1] = spots[0][1];
			 		
			 		second[0] = spots[1][0];
			 		second[1] = spots[1][1];
			 		
			 		
			 		// Select any card with Jack
			 		
			 		if (p.hand[x].getName().equals("J"))
			 		{
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
						
						int index = p.indexOf(b.board[x][y]);
						
						System.out.println("Index returned: " + index);
						
						// Draw new card from deck, replaces selected card from hand
						// Should update GUI from within function
						p.hand = p.drawCard(index);
						
						// Prevent user from selecting another card
						unmarkAll();
						
						// Setup the computer's turn
			            getTurn(e);
					}
				});
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
		updateHand();
		updateBoard();
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
		
		//JFrame f = new JFrame("Sequence!");
		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Board - the 10x10 grid of cards to make a sequence
		
		//Board b = new Board();
		b.setLayout(new GridLayout(10,10));
		b.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.GRAY));
		
		
		// Generate Deck (non-GUI)
		//Deck d = new Deck();
		
		// Player - the 1x6 grid of cards that show player's current hand
		
		//Player p = new Player(d.generateHand());
		p.setLayout(new GridLayout(1,6));
		p.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
		
		// Adding everything to Frame
		
		f.add(b);
		f.add(p, BorderLayout.PAGE_END);		
		f.setVisible(true);
		

		// Add action listener for every button in Hand
		
		updateHand();
		
		// Add ActionListener for every BoardCard
		
		updateBoard();
		
		/***** LOGIC *****/
		
		// Human's turn
		
		// 1) Select card from hand (only one card should be selected at a time)
		// 2) Get index of selected card -- might not be needed
		// 3) Find where the card is on the board
		// 4) Highlight matching BoardCard
		// 5) Allow user to choose the BoardCard, or select another card from hand
		// 6) Repeat...
	}
}