package com.syntacticsugar.sequence;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class BoardCard extends Card 
{
	public boolean highlighted; // If true, highlights BoardCard
	public boolean enabled; // If true, BoardCard can be selected
	
	private boolean mouseEntered;
	private boolean mousePressed;
	
	public BoardCard()
	{
		super("", "");
		highlighted = false;
		enabled = true;
	}
	
	public BoardCard(String n, String s, boolean h, boolean e)
	{
		super(n, s);
		highlighted = h;
		enabled = e;
	}
	
	public void printCard()
	{
		super.printCard();
		System.out.printf("Has it already been selected? %b\n", highlighted);
		System.out.printf("Is this card enabled? %b\n", enabled);
	}
	
	/****** GUI ******/
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(60, 60);
	}
	
	@Override
	public Dimension getMinimumSize()
	{
		return new Dimension(45, 45);
	}
	
	@Override
	public Dimension getMaximumSize()
	{
		return new Dimension(75, 75);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		

        // Anti-Aliasing
        Graphics2D antiAlias = (Graphics2D)g;
        antiAlias.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw white rectangle
        g.setColor(Color.WHITE);
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 1, 1); 
        
        // Draw border
        if(mouseEntered)
        {
            g.setColor(Color.YELLOW);
        }
        else
        {
            g.setColor(Color.GREEN);
        }
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);
        
        // Draw name

        JLabel c = new JLabel(name);
        c.setBounds(getWidth()/3, getHeight()/2, 20, 40);
        c.paint(g);
        
        // Show suit
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		// Nothing
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
        mouseEntered = true;
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
        mouseEntered = false;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
	}

	@Override
    public void mousePressed(MouseEvent e)
    {
        mousePressed = true;
        System.out.println("WHO CLICKED ME?!?!");
        repaint();
    }
	
	@Override
    public void mouseReleased(MouseEvent e)
    {
        mousePressed = false;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
    }
}