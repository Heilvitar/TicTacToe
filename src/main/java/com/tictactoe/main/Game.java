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
	public void inputFromPlayer(int xCoord, int yCoord){
		gameBoard.getBoard()[xCoord][yCoord] = getCurrentPlayer().getPlayerSymbol();
	}
	//gameBoard.mark();
	public bool checkWin(){
		char cPSymbol = currentPlayer.getPlayerSymbol();
		for(int i = 0; i < 3; i++){
			if(gameBoard.getMar(i, 0) == cPSymbol && gameBoard.getMar(i, 1) == cPSymbol && gameBoard.getMar(i, 2) == cPSymbol){
				return true;
			}
			if(gameBoard.getMar(0, i) == cPSymbol && gameBoard.getMar(1, i) == cPSymbol && gameBoard.getMar(2, i) == cPSymbol){
				return true;	
			} 
		
		}
		
		
	
	}
}
