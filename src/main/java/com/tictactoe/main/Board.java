package com.tictactoe.main;

public class Board{
	private static final int BOARDSIZE = 3;
        // A count for how many squares have been marked, e.g. filled in
        private int markCount;

        // The character array that will hold all of the marks in a game
	private char[][] fieldBoard;
	
	public Board(){
		fieldBoard = new char[BOARDSIZE][BOARDSIZE];
		// Initializes an empty game board
		for(int i = 0; i < BOARDSIZE; i++){
			for(int j = 0; j < BOARDSIZE; j++){
			    fieldBoard[i][j] = '-'; // the char '-' will denote that a square is empty
			}		 
		}
		markCount = 0;
	}
	
        // Returns a copy of the entire character array board 
	public char[][] getBoard(){
		return fieldBoard.clone();
	}
	
        // Marks the square on the board with the given symbol
	public void mark(int xCoord, int yCoord, char symbol){
		fieldBoard[xCoord][yCoord] = symbol;
		markCount++;
	}
	
        // Returns the mark, at the requested location
	public char getMark(int xCoord, int yCoord){
		return fieldBoard[xCoord][yCoord];
	}
        
        // Returns true if all of the squares of the board have been marked
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
