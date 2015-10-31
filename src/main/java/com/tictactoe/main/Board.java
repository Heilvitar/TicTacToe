package com.tictactoe.main;

public class Board{
	
	private static final int BOARDSIZE = 3;
	
	private char[][] fieldBoard;
	

	public Board(){
		fieldBoard = new char[BOARDSIZE][BOARDSIZE];
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; j < BOARDSIZE; j++){
				fieldBoard[i][j] = '-';
			}		 
		}
	}
	
	public char[][] getBoard(){
		return fieldBoard;
	}
	public void mark(int xCoord, int yCoord, char symbol){
		fieldBoard[xCoord][yCoord] = symbol;	
	}
	
	public char getMark(int xCoord, int yCoord){
		return fieldBoard[xCoord][yCoord];
	}
}
