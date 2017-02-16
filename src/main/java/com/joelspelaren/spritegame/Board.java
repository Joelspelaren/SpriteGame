package com.joelspelaren.spritegame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;
import javax.swing.Timer;



public class Board extends JPanel implements ActionListener {
	
	private Timer timer;
	int yPos = 0;
        int speed = 1;
	int timre = 0;
	int score = 0;
	int xPos = 50;
	private int charNumber = 0;
	int timeToFinish = 0;
	
	public Board() {
		addKeyListener(new TAdapter());
        setFocusable(true);
		timer = new Timer(10, this);
		timer.start();
	}
//    public void addNotify() {
//        super.addNotify();
//    }
	
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        doDrawing(g);

    }
	
	private void doDrawing(Graphics g) {
		timre ++;
		Graphics2D g2d = (Graphics2D) g;
		char[] data = {'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','�','�','�'};
		g2d.drawChars(data, charNumber, 1, xPos, yPos = yPos + speed);
		if(yPos > 320){
			int min = 0;
	    	int max = 25;
			//charNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
	    	charNumber = 0;
			yPos = 0;
			xPos = ThreadLocalRandom.current().nextInt(20, 520 + 1);
			yPos = 0;
		}
//		if (timeToFinish != 0){
			char[] data2 = String.valueOf(timeToFinish).toCharArray();
			g2d.drawChars(data2, 0, data2.length, 100, 20);
//		}
	}

	public void actionPerformed(ActionEvent e){
		repaint();
	}
	
    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {

        	//System.out.println("Tangent sl�ppt");
//            player.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
        	System.out.println("Tangent tryckt");
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_A){
                if(charNumber == 0){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_B){
                if(charNumber == 1){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_C){
                if(charNumber == 2){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_D){
                if(charNumber == 3){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_E){
                if(charNumber == 4){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_F){
                if(charNumber == 5){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_G){
                if(charNumber == 6){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_H){
                if(charNumber == 7){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_I){
                if(charNumber == 8){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_J){
                if(charNumber == 9){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_K){
                if(charNumber == 10){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_L){
                if(charNumber == 11){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_M){
                if(charNumber == 12){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_N){
                if(charNumber == 13){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_O){
                if(charNumber == 14){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_P){
                if(charNumber == 15){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_Q){
                if(charNumber == 16){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_R){
                if(charNumber == 17){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_S){
                if(charNumber == 18){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_T){
                if(charNumber == 19){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_U){
                if(charNumber == 20){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_V){
                if(charNumber == 21){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_W){
                if(charNumber == 22){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_X){
                if(charNumber == 23){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_Y){
                if(charNumber == 24){
                	score ++;
                	charNumber ++;
                	yPos = 0;
                }
                }
            if (key == KeyEvent.VK_Z){
                if(charNumber == 25){
                    speed = speed + 1;
                	score ++;
                	charNumber = 0;
                	yPos = 0;
                	timre = timre / 100;
                	timeToFinish = timre;
//                	timre = 0;
                }
                }
           System.out.println(score);
            
//          player.keyPressed(e);

//          int x = player.getX();
//          int y = player.getY();

//          if (ingame)
//          {
////              if (e.isAltDown()) {
//                  
//        	  if (e.isControlDown()) {
////                if (!shot.isVisible())
//                    shot = new Shot(x, y);
//            }
//          }
           if(charNumber > 25 ){
        	   charNumber = 0;
           }
        }
    }

}
