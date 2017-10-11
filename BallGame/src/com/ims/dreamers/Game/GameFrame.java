package com.ims.dreamers.Game;

import javax.swing.JFrame;

import com.ims.dreamers.GameUtils.IGameConstants;

public class GameFrame extends JFrame implements IGameConstants{
public GameFrame()
{GameBoard board=new GameBoard();
	setSize(GAME_WIDTH,GAME_HEIGHT);
	setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
	add(board);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame frame=new GameFrame();

	}

}
