package com.syntacticsugar.sequence;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel {

	public static void main(String[] args) 
	{
		// Game starts
		
		// Initialize a Deck
		
		new Deck();
		System.out.println("Testing Card print. Name and suit");
		Deck.deck[44].printCard();
		System.out.println();
		
		//Deck myDeck = new Deck();
		// These will print out their hands for now
		//Human human = new Human(myDeck.generateHand());
		//CPU robot = new CPU(myDeck.generateHand());
		
		
		// Initalize a Board
		/*
		new Board();
		System.out.println("Testing BoardCard print. Name/Suit and highlight state");
		Board.board[2][5].printCard();
		System.out.println();
		
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
		
		
		
		
		/****** GUI - DO NOT REMOVE THE FOLLOWING CODE ******/
		
		// Initialize Frame - height, width, color
		
		JFrame f = new JFrame("Sequence by Syntactic Sugar, Ltd.");
		f.setSize(1000,1000);
		f.setLayout(new BorderLayout());
		
		// Create Board
		
		Board b = new Board();
		//b.setSize(100, 100);
		b.setBackground(Color.BLUE);
		f.add(b, BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
