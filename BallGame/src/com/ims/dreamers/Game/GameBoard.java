package com.ims.dreamers.Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.ims.dreamers.GameUtils.GameUtil;
import com.ims.dreamers.GameUtils.IGameConstants;

public class GameBoard extends JPanel implements IGameConstants {
	private Timer timer;
	int MAX_BALL=3;
	int counter=0;
	static GameUtil gameUtil =new GameUtil(50);
	Ball balls[]=new Ball[MAX_BALL];
	public void prepareBalls()
	{
		
		for(int i=0;i<MAX_BALL;i++)
		{Ball ball=new Ball();
			balls[i]=ball;
		}
	}
	public void checkCollision()
	{
		for(int i=0;i<balls.length;i++)
		{
			for(int j=i+1;j<balls.length;j++)
				{if(isCollision(balls[i],balls[j]))
					{counter++;
					balls[i].setXspeed(-20);
					balls[j].setXspeed(30);
					balls[i].setYspeed(-40);
					balls[j].setYspeed(30);
					
					
                    }
					//	System.out.println(isCollision(balls[i],balls[j]));
				}
		}
	}
	public boolean isCollision(Ball ball1,Ball ball2)
	{int xDistance=Math.abs(ball1.getX()-ball2.getX());
	int yDistance=Math.abs(ball1.getY()-ball2.getY());
	return (xDistance<=ball1.getW()) && (yDistance<=ball2.getH());
}
	
	public GameBoard()
	{
		setBackground(Color.yellow);
		prepareBalls();
		
		GameLoop();
	}
	public void GameLoop()
	{timer=new Timer(GAME_SPEED,(e)->{
		repaint();
		
	});
	timer.start();
	}
	public void drawScore(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD,30));
		g.drawString("no of collisions"+counter, 100,100);
			
	}
	@Override
	public void paintComponent(Graphics g)
	{super.paintComponent(g);
		for(Ball ball:balls)
			{ball.draw(g);
			ball.move();
			ball.changeDirection();
			checkCollision();
			
			}
		drawScore(g);
		}
	}


