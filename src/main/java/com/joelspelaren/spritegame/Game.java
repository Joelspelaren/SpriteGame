package com.joelspelaren.spritegame;

import javax.swing.JFrame;

public class Game extends JFrame {
	
	public Game(){
		add(new Board());
		setTitle("Joel Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 350);
        setLocationRelativeTo(null);
		setVisible(true);
		setResizable (false);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}

}
