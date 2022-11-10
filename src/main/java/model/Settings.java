package model;

import java.util.LinkedList;

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

import gamemodes.*;

public class Settings{
	public KeyCode left_up;
	public KeyCode left_down;
	public KeyCode right_up;
	public KeyCode right_down;
	public KeyCode stop;
	public KeyCode turbo;
	public Color forground_color;
	public Color background_color;
	public LinkedList<Gamemode> gamemodes;


	public Settings(Pane root){
		left_up = KeyCode.A;
		left_down = KeyCode.Q;
		right_up = KeyCode.UP;
		right_down = KeyCode.DOWN;
		stop = KeyCode.ESCAPE;
		turbo = KeyCode.SPACE;
		
		forground_color = Color.BLACK;
		background_color = Color.WHITE;
		
		gamemodes = new LinkedList<>();
		

		LinkedList<Gamemode> list_gamemodes = new java.util.LinkedList<gamemodes.Gamemode>();

		list_gamemodes.add(new gamemodes.RacketLength(2));
		list_gamemodes.add(new gamemodes.RackWTF());
		
		
		gamemodes.add(new gamemodes.Bonus_Malus(root,list_gamemodes));
		//gamemodes.add(new RacketLength());
		//gamemodes.add(new gamemodes.Ia(3,false));
		//gamemodes.add(new gamemodes.Ia(4,true));
		//gamemodes.add(new gamemodes.Acceleration());
	}
}
