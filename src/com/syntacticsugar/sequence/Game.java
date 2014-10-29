package com.syntacticsugar.sequence;

public class Game {

	public static void main(String[] args) 
	{
		// Game starts
		
		// Initialize Deck
		
		new Deck();
		Deck.deck[16].printCard();
		
		// Initialize Board
		
		new Board();
		Board.board[0][0].printCard();
		Board.board[0][2].printCard();
		
		int[][] spots = Board.indexOf(Deck.deck[91]);
		
		// Testing where the card is. Check the Board class to confirm location
		System.out.println(Deck.deck[91].getName() + "-" + Deck.deck[91].getSuit() + 
				" is located at (" + spots[0][0] + ", " + spots[0][1] + 
				") and (" + spots[1][0] + ", " + spots[1][1] + ")");
		
		// etc...

	}

}
