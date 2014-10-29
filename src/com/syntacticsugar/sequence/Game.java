package com.syntacticsugar.sequence;

public class Game {

	public static void main(String[] args) 
	{
		// Game starts
		
		// Initialize 2 Deck objects
		
		Deck myDeck = new Deck();
		
		// These will print out their hands for now
		Human human = new Human(myDeck.generateHand());
		CPU robot = new CPU(myDeck.generateHand());
		
		// Deck.deck[16].printCard();
		
		
		// Initialize a Board object
		
		// etc...

	}

}
