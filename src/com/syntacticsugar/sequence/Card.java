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

}
