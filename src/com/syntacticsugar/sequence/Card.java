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
	private int numPicked = 0;
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
		// GUI
		updateCard();
		
		/***** ACTION *****/
		
		// Set enabled state
		// You will never click the free space
		if (suit == "")
		{
			setEnabled(false);
		}
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
	}
	
	// GUI function
	public void updateCard()
	{
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
	}
	
	public void incrementNumPicked()
	{
		numPicked++;
	}
	
	public int getNumPicked()
	{
		return numPicked;
	}
	
	// equalsDeck - because "equals" only does BoardCard
	// only used in Deck, so... that's why it's called that
	public boolean equalsDeck(Card c)
	{
		if (c == null)
		{
			return false;
		}
		
		if (this.getName().equals(c.getName()) && this.getSuit().equals(c.getSuit()))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
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
