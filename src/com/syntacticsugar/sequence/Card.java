package com.syntacticsugar.sequence;

public class Card {
	
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
