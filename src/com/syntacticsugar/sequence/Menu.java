package com.syntacticsugar.sequence;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Menu extends JFrame{
	JButton button1, button2;
	
	public Menu()
	{
		initUI();
	}
	
	public final void initUI()
	{
		JPanel panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(1, 4, 100, 100));
        
        //button 1 is for 1 player
        button1 = new JButton("Start");
        button1.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	
            	//Put "go to game here"
            	Game.main(new String[0]);
            }
        }));
        
        //button 2 is for 2
        button2 = new JButton("Exit");
        button2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
            	
            	//Put "go to game here"
                System.exit(0);
                
            }
        }));
        
        panel.add(button1);
        panel.add(button2);

        add(panel);

        setTitle("GridLayout");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                Menu ex = new Menu();
                ex.setVisible(true);
            }
        });
    }
}
