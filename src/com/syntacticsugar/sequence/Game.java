package com.syntacticsugar.sequence;
import java.awt.GridLayout;







import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game 
{
	// GUI Elements
	
	public static JFrame f = new JFrame("Sequence!");
	public static Board b = new Board();
	public static Deck d = new Deck();
	public static Player p = new Player();
	public static Player cpu = new Player();

	// Stuff accessed by multiple functions
	
	public static int turnIndex = 0;
	public static boolean isWild = false;
	
	public static Random rand = new Random(System.currentTimeMillis());
	
	/***** SELECTION LOGIC *****/
	
	// HUMAN - Clicking Card
	
	public static void enableDeck()
	{
		for (int i = 0; i < d.getDeck().size()-1; i++)
		{
			final int x = i;
			
			d.getDeck().get(i).addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					int index = x;

					findCard(index, 1); // Human = player 1
				}
			});
		}
	}
	
	// HUMAN + CPU - Finding chosen card on Board
	
	public static void findCard(int index, int owner)
	{
		
		int cardsLeft = d.getDeck().size();
		// Initialize new Deck to make compiler happy
		Deck myD = new Deck();
		
		// Find the two spots on the Board where the chosen card is
		int spots[][] = Board.indexOf(myD.getDeck().get(index));
 		
 		// Simplifying spots[][]
 		int first[] = new int[2]; // location of first card
 		int second[] = new int[2]; // location of second card
 		
 		first[0] = spots[0][0];
 		first[1] = spots[0][1];
 		
 		second[0] = spots[1][0];
 		second[1] = spots[1][1];

 		// Function to mark the cards on the Board
 		Card c = myD.getDeck().get(index);
 		markCard(c, first, second, owner);
	}
	
	public static void markCard(Card c, int[] first, int [] second, int owner)
	{	
		int cpuIndex = 0;
		
 		// Select any card with Jack
 		if (c.getName().equals("J"))
 		{
 			isWild = true;
 			
 			// Human
 			if (owner == 1)
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
 			
 			// CPU
 			else
 			{
 				int max = 9;
 				int min = 0;
 				
 				int randX = 0;
 				int randY = 0;
 				
 				// Make sure CPU is going to select a card than can be picked
 				while (b.board[randX][randY].highlighted)
 				{
 					randX = rand.nextInt(max + 1) + min;
 					randY = rand.nextInt(max + 1) + min;
 				}
 				
 				b.board[randX][randY].highlight(2);
 				checkWin(2, randX, randY);
 								
 				// Find Jack
				for (int i = 0; i < 6; i++)
				{
					if (p.handList.get(i).getName().equals("J"))
					{
						cpuIndex = i;
					}
				}
			
				cpu.drawCard(d.getDeck(), cpuIndex);
 			}
 		}
 		
 		// Any card that isn't a Jack (just show that specific card)
 		else
 		{
 			isWild = false;
 			
 			if (owner == 1)
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
 			}
 			
 			else
 			{
 				// Just make CPU pick the first one, if available
 				
 				if (b.board[first[0]][first[1]].highlighted)
 				{
 					c.printCard();
 					b.board[second[0]][second[1]].highlight(2);
 					checkWin(2, second[0], second[1]);
 					
 					cpuIndex = cpu.indexOf(b.board[second[0]][second[1]]);
 				}
 				else
 				{
 					c.printCard();
 					b.board[first[0]][first[1]].highlight(2);
 					checkWin(2, first[0], first[1]);
 					
 					cpuIndex = cpu.indexOf(b.board[first[0]][first[1]]);
 				}
			
 				replaceDeadCard(cpu);
				cpu.drawCard(d.getDeck(), cpuIndex);
				
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
	
	// HUMAN - Click the card on the Board; confirms selection
	
	public static void updateBoard()
	{
		
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				final int x = i;
				final int y = j;
				
				b.board[i][j].addActionListener(new ActionListener()
				{
					// A BoardCard was selected
					
					@Override
					public void actionPerformed(ActionEvent e) 
					{	
						// Highlight selected BoardCard
						
						b.board[x][y].highlight(1);
						checkWin(1,x,y);
				
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
							// does this work? YES
						}
						
						// Draw new card from deck, replaces selected card from hand
						// Should update GUI from within function
						
						replaceDeadCard(p);
						p.drawCard(d.getDeck(), index);

						
						// Prevent user from selecting another card
						unmarkAll();
						
						// Setup the computer's turn
			            getTurn(e);
					}
				});
			}
		}
	}
	
	// HUMAN + CPU - Disable Board and unmark every card to prevent user selection
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
	
	/***** TURN LOGIC *****/
	
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
			humanTurn();
		}
		
		else
		{
			computerTurn();
		}
	}
	
	// Update GUI
	public static void humanTurn()
	{
		enableDeck();
		Board.board[0][0].setOwner(1);
		Board.board[0][9].setOwner(1);
		Board.board[9][0].setOwner(1);
		Board.board[9][9].setOwner(1);
	}
	
	// CPU stuff
	public static void computerTurn()
	{
		// If we can't get AI working then this will do
 		
 		int min = 0;
 		int max = 5;
 		
 		// Equivalent of human clicking card in hand
 		int index = rand.nextInt(max + 1) + min;
 		
 		cpu.handList.get(index).printCard();
 		
 		// Have to find the hand's card in the deck for findCard
 		int deckIndex = d.indexOf(cpu.handList.get(index));
 		
 		findCard(deckIndex, 2); // CPU = player 2
 		
		turnIndex++;
		turnIndex %= 2;
		
		changeTurn(turnIndex);
	}
	
	// Replaces dead cards - cards played twice
	public static void replaceDeadCard(Player myPlayer){
		
		// need Board, cpu.handlist, p.handlist

		int deadIndex = d.returnDeadIndex(b, myPlayer.handList);
		if (deadIndex != -1)
		myPlayer.drawCard(d.getDeck(), deadIndex);
			

		
		
		
	}
	
	public static void checkWin (int p, int x, int y){
		int row = 1, block = 0; // Row is the number of spaces correctly highlighted, block is how many times method detects an incorrect highlight
		int i = x; //Reference
		int j = y; //Reference
		String directions[] = {"ud","rl","drul","urdl"}; //Directions
		boolean done = false; //This was important when the method returned a boolean
		int a = 0; //determines which direction is referenced, possibly don't need the array above is this is in play
		
		Board.board[0][0].setOwner(p);
		Board.board[0][9].setOwner(p);
		Board.board[9][0].setOwner(p);
		Board.board[9][9].setOwner(p);
		
		while(done == false && a < 4){
			
			String direction = directions[a];
			
			//Will reset row and block after every iteration of the while loop below
			row = 1;
			block = 0;
			i = x;
			j = y;
			
			while(row < 5 && block < 3 ){
			
				//This is a reset
				if(block > 0 && block != 2){
					block++;
					i = x;
					j = y;
				}
			
				//increment up then down
				if(direction == "ud" && block == 0){
					i++;
				}else if (direction == "ud" && block != 0){
					i--;
					
				//increment right then left	
				}else if (direction == "rl" && block == 0){
					j++;
					
				}else if (direction == "rl"&& block != 0){
					j--;
				
				//increment down-right then up-left
				}else if (direction == "drul" && block == 0){
					i++;
					j++;
					
				}else if (direction == "drul" && block != 0){
					i--;
					j--;
				
				//increment up-right then down-left	
				}else if (direction == "urdl" && block == 0){
					i--;
					j++;
					
				}else if (direction == "urdl" && block != 0){
					i++;
					j--;
				}
				
				//Checks spot on the board if it is in bounds of array and highlighted correctly
				if(i < 0 || j < 0 || i > 9 || j > 9){
					block ++;
				}else if(Board.board[i][j].getOwner() == p){
					row++;
				}else{
					block++;
				}
				
				//Before break it says that the person won
				if(row == 5){
					done = true;
					
					if (p == 1)
					{
						JOptionPane.showMessageDialog(f, "You win!");
						System.exit(0);
					}
					
					else
					{
						JOptionPane.showMessageDialog(f, "You lose...");
						System.exit(0);
					}
				}
			}
			
			a++;
		}
		
		Board.board[0][0].setOwner(0);
		Board.board[0][9].setOwner(0);
		Board.board[9][0].setOwner(0);
		Board.board[9][9].setOwner(0);
		
	}

	public static void main(String[] args) 
	{
		/***** GUI *****/
		
		// Frame - the main window that holds everything.

		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.getContentPane().setBackground(new Color(67,178,64));
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Board - the 10x10 grid of cards to make a sequence

		b.setLayout(new GridLayout(10,10));
		b.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.GRAY));
		
		
		// Enable ActionListener for Deck (will be called with every Human Turn
		enableDeck();
		
		// Player - the 1x6 grid of cards that show player's current hand
		
		p.makeHand(d.generateHand());
		p.setLayout(new GridLayout(1,6));
		p.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.GRAY));
		
		// CPU - no GUI required
		cpu.makeHand(d.generateHand());
		
		// Adding everything to Frame
		
		f.add(b);
		// a line, maybe we don't need it, but it adds to the gui :P
		JSeparator s = new JSeparator(SwingConstants.HORIZONTAL);
		s.setBackground(Color.black);
        s.setPreferredSize(new Dimension(600,3));  
        f.add(s);
        
		f.add(p, BorderLayout.PAGE_END);
		f.setVisible(true);
		
		// Add ActionListener for every BoardCard - only needs to be called once
		updateBoard();
	}
}