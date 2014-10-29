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
		
		// etc...

	}

}
