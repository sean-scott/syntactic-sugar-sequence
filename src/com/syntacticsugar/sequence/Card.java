package com.syntacticsugar.sequence;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Card extends JButton {
	
	protected String name;
	protected String suit;

	public Card()
	{
		super(); // JComponent constructor
		name = "";
		suit = "";
	}
	public Card(String n, String s)
	{
		name = n;
		suit = s;
		
		/***** UNIVERSAL GUI *****/
		
		// Card background
		
		setBackground(Color.WHITE);
		setOpaque(true);

		// Show value & suit (uses Unicode)
		
		Font font = new Font(getFont().getName(), getFont().getStyle(), 16);
		setFont(font);
		
		if (s == "Clubs")
		{
			setText(n + " \u2663");
		}
		
		if (s == "Diamonds")
		{
			setText(n + " \u2666");
			setForeground(Color.RED);
		}
		
		if (s == "Hearts")
		{
			setText(n + " \u2665");
			setForeground(Color.RED);
		}
		
		if (s == "Spades")
		{
			setText(n + " \u2660");
		}
		
		if (s == "")
		{
			setText("\u2605");
		}
		
		
		/***** ACTION *****/
		
		// Set enabled state
		// You will never click the free space
		if (s == "")
		{
			setEnabled(false);
		}
		
		// Set enabled state based on card selected from deck
		
		
			// Everything disabled at start
			// specific cards enabled upon clicking a card in Hand
		
		
		// Console output for now, more later...
		
		addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e)
            {
                // When clicked how name and suit
                System.out.println("You selected the " + n + " of " + s);
            }
        });
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
