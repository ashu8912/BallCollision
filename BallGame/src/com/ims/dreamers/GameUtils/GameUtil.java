package com.ims.dreamers.GameUtils;

import java.util.Random;

public class GameUtil {
int range;
	Random r;
public GameUtil(int range)
{
	this.range=range;
	r=new Random(range);
}
public int getRandomNumber()
{
	return r.nextInt(this.range);
}
}
