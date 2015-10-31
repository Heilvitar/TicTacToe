package com.tictactoe.main;

public class Game{
	public Player player1;
	public Player player2;
	public Board gameBoard;
	private int playersTurn;
	
	//public Scanner input = new Scanner(System.in);
	
	public Game()
	{
		this.player1 = new Player('x');
        	this.player2 = new Player('o');
		this.gameBoard = new Board();
		this.playersTurn = 1; 
	}
	
	public void changePlayersTurn(){
		if (playersTurn == 1){
			playersTurn = 2;
		}
		else {
			playersTurn = 1;
		}
	}
	public Player getCurrentPlayer(){
               if (playersTurn == 1){
                       return  player1;
                }
                else {
                       return  player2;
                }

	}
	public boolean inputFromPlayer(int xCoord, int yCoord){
	    if(gameBoard.getMark(xCoord, yCoord) == '-') {
		gameBoard.mark(xCoord, yCoord, getCurrentPlayer().getSymbol());
		return true;
	    }
	    return false;
	}
	//gameBoard.mark();
	public boolean checkWin(){
	        char cPSymbol = getCurrentPlayer().getSymbol();
		for(int i = 0; i < 3; i++){
		    if((gameBoard.getMark(i, 0) == cPSymbol) && (gameBoard.getMark(i, 1) == cPSymbol) && (gameBoard.getMark(i, 2) == cPSymbol)){
				return true;
			}
		    if((gameBoard.getMark(0, i) == cPSymbol) && (gameBoard.getMark(1, i) == cPSymbol) && (gameBoard.getMark(2, i) == cPSymbol)){
				return true;	
			} 
			
		}


                if((gameBoard.getMark(0,0) == cPSymbol) && (gameBoard.getMark(1,1) == cPSymbol) && (gameBoard.getMark(2,2) == cPSymbol))
                {
                        return true;
                }
		if((gameBoard.getMark(0,2) == cPSymbol) && (gameBoard.getMark(1,1) == cPSymbol) && (gameBoard.getMark(2,0) == cPSymbol))
		{
			return true;
		}

		return false;
	}
        
        public boolean checkTie()
        {
	    return gameBoard.isFull();
	}
}
