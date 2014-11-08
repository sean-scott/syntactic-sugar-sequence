package com.syntacticsugar.sequence;
import java.awt.GridLayout;




import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
	
	public static boolean humanTurn()
	{
		return false;
	}
	
	public static boolean computerTurn()
	{
		
		
		return false;
	}

	public static void main(String[] args) 
	{
		/***** GUI *****/
		
		// Frame - the main window that holds everything.
		
		JFrame f = new JFrame("Sequence!");
		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Board - the 10x10 grid of cards to make a sequence
		
		Board b = new Board();
		b.setLayout(new GridLayout(10,10));
		b.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.GRAY));
		
		
		// Generate Deck (non-GUI)
		Deck d = new Deck();
		
		// Player - the 1x6 grid of cards that show player's current hand
		
		Player p = new Player(d.generateHand());
		p.setLayout(new GridLayout(1,6));
		p.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
		
		// Adding everything to Frame
		
		f.add(b);
		f.add(p, BorderLayout.PAGE_END);		
		f.setVisible(true);
		
		for (int i = 0; i < 6; i++)
		{
			p.hand[i].addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("WOW");
					System.out.println(e.getSource().getClass());
					
				}
				});
		}
		
		/***** LOGIC *****/
		
		// Human's turn
		
		// 1) Select card from hand (only one card should be selected at a time)
		// 2) Get index of selected card -- might not be needed
		// 3) Find where the card is on the board
		// 4) Highlight matching BoardCard
		// 5) Allow user to choose the BoardCard, or select another card from hand
		// 6) Repeat...
		
		// TURN LOGIC
		
		boolean gameOver = false;
		
		boolean humanWon = false;
		boolean computerWon = false;
		
		while (!gameOver)
		{
			humanWon = humanTurn();
			
			if (humanWon)
			{
				System.out.println("Human wins!");
				gameOver = true;
			}
			
			else if (computerWon)
			{	
				System.out.println("Computer wins");
				gameOver = true;
			}
			
			else
			{
				computerWon = computerTurn();
			}
		}
		
		
		
		
		
		
		
		
		/*
		
		int[][] spots = Board.indexOf(d.selectCard());
 		System.out.println("Find where the card is equal to the cards on the Board");
 		System.out.println(Deck.deck[12].getName() + "-" + Deck.deck[12].getSuit() + 
 			" is located at (" + spots[0][0] + ", " + spots[0][1] + 
 			") and (" + spots[1][0] + ", " + spots[1][1] + ")");
 		System.out.println();
		*/
		//?
		/*
		int[][] spots = Board.indexOf(Deck.deck[12]);
			
 		// Testing where the card is. Check the Board class to confirm location
 		System.out.println("Find where the card is equal to the cards on the Board");
 		System.out.println(Deck.deck[12].getName() + "-" + Deck.deck[12].getSuit() + 
 			" is located at (" + spots[0][0] + ", " + spots[0][1] + 
 			") and (" + spots[1][0] + ", " + spots[1][1] + ")");
 		System.out.println();
 		
 		
 		
 		int first[] = new int[2];
 		first[0] = spots[0][0];
 		first[1] = spots[0][1];
 		
 
 		System.out.println("Selecting this card. Highlight state will change");
 		System.out.println();
 		
 		Board.selectCard(first);
 		System.out.println("Testing BoardCard print. Name/Suit and highlight state");
 		Board.board[2][5].printCard();
 		System.out.println();
 		*/
	}
}