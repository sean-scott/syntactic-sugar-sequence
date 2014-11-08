package com.syntacticsugar.sequence;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Card extends JButton {
	
	private String name;
	private String suit;
	
	public boolean selected; // Allows user to clearly see what card is currently in use

	public Card()
	{
		name = "";
		suit = "";
		selected = false;
	}
	
	public Card(String n, String s)
	{
		name = n;
		suit = s;
		selected = false;
		
		/***** UNIVERSAL GUI *****/
		
		// Card background
		
		setBackground(Color.WHITE);
		setOpaque(true);

		// Show value & suit (uses Unicode)
		
		Font font = new Font(getFont().getName(), getFont().getStyle(), 20);
		setFont(font);
		
		if (name == "Joker")
		{
			setText("\u265B");
		}
		
		if (suit == "Clubs")
		{
			setText(name + " \u2663");
		}
		
		if (suit == "Diamonds")
		{
			setText(name + " \u2666");
			setForeground(Color.RED);
		}
		
		if (suit == "Hearts")
		{
			setText(name + " \u2665");
			setForeground(Color.RED);
		}
		
		if (suit == "Spades")
		{
			setText(name + " \u2660");
		}
		
		if (suit == "")
		{
			setText("\u2605");
		}
		
		setPreferredSize(new Dimension(90,130));
		
		
		/***** ACTION *****/
		
		// Set enabled state
		// You will never click the free space
		if (suit == "")
		{
			setEnabled(false);
		}
		
		// Set enabled state based on card selected from deck
		
		
			// Everything disabled at start
			// specific cards enabled upon clicking a card in Hand
		
		
		// Console output for now, more later...
		/*
		addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e)
            {
                // When clicked how name and suit
                System.out.println("You selected the " + n + " of " + suit);
                selectCard();
            }
        });
        */
	}
	
	// Set/Get 'name'
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	// Set/Get 'suit'
	
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public void printCard()
	{
		String value;
		
		if (name.equals("A"))
		{
			value = "Ace";
		}
		
		else if (name.equals("J"))
		{
			value = "Jack";
		}
		
		else if (name.equals("Q"))
		{
			value = "Queen";
		}
		
		else if (name.equals("K"))
		{
			value = "King";
		}
		
		else
		{
			value = name;
		}
		
		if (value.equals(""))
		{
			System.out.println("Free");
		}
		
		else
		{
			System.out.println(value + " of " + suit);
		}
	}
	
	// selectCard - highlight
	/*
	public void selectCard()
	{
		
		BoardCard bc = new BoardCard(name, suit, true, true);
		if (selected)
        {
        	selected = false;
        	setBackground(Color.WHITE);
        }
        else
        {
        	selected = true;
        	setBackground(Color.YELLOW);
        	int[][] cardLocations = Board.indexOf(new Card(name,suit));
        	int x = cardLocations[0][0];
        	int y = cardLocations[0][1];
        	System.out.println(x);
        	Board.board[5][5].highlight(); // Random for now
        }
	}
	*/
	// Overloading the "equals" operator for checking if Card matches the BoardCard.
	public boolean equals(BoardCard b)
	{	
		if (b == null)
		{
			return false;
		}
		
		if (this.getName().equals(b.getName()) && this.getSuit().equals(b.getSuit()))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
