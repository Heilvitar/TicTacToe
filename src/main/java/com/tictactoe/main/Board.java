package com.tictactoe.main;

public class Board{
	
	private static final int BOARDSIZE = 3;
        private int markCount;

	private char[][] fieldBoard;
	
	public Board(){
		fieldBoard = new char[BOARDSIZE][BOARDSIZE];
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; j < BOARDSIZE; j++){
				fieldBoard[i][j] = '-';
			}		 
		}
		markCount = 0;
	}
	
	public char[][] getBoard(){
		return fieldBoard.clone();
	}
	
	public void mark(int xCoord, int yCoord, char symbol){
		fieldBoard[xCoord][yCoord] = symbol;
		markCount++;
	}
	
	public char getMark(int xCoord, int yCoord){
		return fieldBoard[xCoord][yCoord];
	}
        
        public boolean isFull()
        {
	    if(markCount == 9) {
		return true;
	    }
	    else {
		return false;
	    }
        }

}
