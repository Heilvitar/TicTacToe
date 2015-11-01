package com.tictactoe.main;

public class Game{
	public Player player1;
	public Player player2;
	public Board gameBoard;
        private int playersTurn;
	
	public Game()
	{
		this.player1 = new Player('x');
        	this.player2 = new Player('o');
		this.gameBoard = new Board();
		this.playersTurn = 1; // Player with mark 'x' is first
	}
	
        // Changes the current player
	public void changePlayersTurn() {
		if (playersTurn == 1) {
			playersTurn = 2;
		}
		else {
			playersTurn = 1;
		}
	}

        // Returns the currently active player
	public Player getCurrentPlayer() {
               if (playersTurn == 1) {
                       return  player1;
                }
                else {
                       return  player2;
                }
	}
    
        // marks the board at location (xCoord, yCoord) with the current player mark if the square is not occupied
	public boolean inputFromPlayer(int xCoord, int yCoord) {
	    // only mark the square if the square is not occupied, else return false that the square was not marked
	    if(gameBoard.getMark(xCoord, yCoord) == '-') {
		gameBoard.mark(xCoord, yCoord, getCurrentPlayer().getSymbol());
		return true;
	    }
	    return false;
	}
	
        // returns true if the currently active player has won the game
	public boolean checkWin(){
	        char cPSymbol = getCurrentPlayer().getSymbol();
		// This forloop checks every possible vertical and horizontal wins for current player
		for(int i = 0; i < 3; i++){
		    // checks vertical wins
		    if((gameBoard.getMark(i, 0) == cPSymbol) 
		       && (gameBoard.getMark(i, 1) == cPSymbol) 
		          && (gameBoard.getMark(i, 2) == cPSymbol))
		    {
				return true;
		    }
		    // checks horizontal wins
		    else if((gameBoard.getMark(0, i) == cPSymbol) 
			    && (gameBoard.getMark(1, i) == cPSymbol) 
			       && (gameBoard.getMark(2, i) == cPSymbol))
		    {
				return true;	
		    } 
		}

		// checks right diagonal wins
                if((gameBoard.getMark(0,0) == cPSymbol) 
		   && (gameBoard.getMark(1,1) == cPSymbol) 
		      && (gameBoard.getMark(2,2) == cPSymbol))
                {
                        return true;
                }
		// checks left diagonal wins
		else if((gameBoard.getMark(0,2) == cPSymbol) 
			&& (gameBoard.getMark(1,1) == cPSymbol) 
			   && (gameBoard.getMark(2,0) == cPSymbol))
		{
			return true;
		}

		return false;
	}
        
        // checks if the board is full and we have no winner, hence a tie!!!
        public boolean checkTie()
        {
	    return gameBoard.isFull();
	}
}
