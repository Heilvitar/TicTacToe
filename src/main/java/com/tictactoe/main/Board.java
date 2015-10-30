package com.tictactoe.main;

public class Board{
	
	private static final int BOARDSIZE = 3;
	
	private char[][] fieldBoard;


	public Board(){
		fieldBoard = new char[BOARDSIZE][BOARDSIZE];		 
	}
	
	public char[][]  getBoard(){
		return fieldBoard;
	}
	public void mark(int xCoord, int yCoord, char symbol){
		fieldBoard[xCoord][yCoord] = symbol;	
	}
}
