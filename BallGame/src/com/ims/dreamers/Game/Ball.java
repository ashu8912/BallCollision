package com.ims.dreamers.Game;

import java.awt.Color;
import java.awt.Graphics;

import com.ims.dreamers.GameUtils.GameUtil;
import com.ims.dreamers.GameUtils.IGameConstants;

public class Ball implements IGameConstants{
	private int x;
	private int y;
	private int w;
	//private int shiftLeft=-10;
	//private int shiftRight=10;
	private int h;
	private boolean isVisible;
	

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	//static GameUtil g1=new GameUtil(100);
	 private int xspeed=20;
	private int yspeed=30;
	final int speed=20;
static GameUtil g=new GameUtil(GAME_HEIGHT);

public void setXspeed(int xspeed) {
	this.xspeed = xspeed;
}

public int getXspeed() {
	return xspeed;
}

public int getYspeed() {
	return yspeed;
}
public void setYspeed(int yspeed) {
	this.yspeed = yspeed;
}
public Ball()
{x=g.getRandomNumber();
y=g.getRandomNumber();
//xspeed=g1.getRandomNumber();
//yspeed=g1.getRandomNumber();
	w=h=50;
	}
public void move()
{x+=xspeed;
y+=yspeed;
}

public void changeDirection()
{
	if(x>=GAME_WIDTH-w)
		xspeed=-speed;
	if(x<=0)
		xspeed=speed;
	if(y>=GAME_HEIGHT-h)
		yspeed=-speed;
	if(y<=0)
		yspeed=speed;
}
public void draw(Graphics g)
{g.setColor(Color.RED);
	g.fillOval(x, y, w, h);
}
public int getW() {
	return w;
}
public void setW(int w) {
	this.w = w;
}
public int getH() {
	return h;
}
public void setH(int h) {
	this.h = h;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

}
