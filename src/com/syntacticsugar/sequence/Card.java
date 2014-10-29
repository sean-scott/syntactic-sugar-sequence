package com.syntacticsugar.sequence;

public class Card {
	
	private String name;
	private String suit;
	
	public Card()
	{
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

}
