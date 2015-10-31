package com.tictactoe.main;

public class Game{
	public Player player1;
	public Player player2;
	public Board gameBoard;
	//public Scanner input = new Scanner(System.in);
	public Game()
	{
		this.player1 = new Player('x');
        	this.player2 = new Player('o');
		this.gameBoard = new Board();
	}
	
	//getcurrentPlayer();
	//getInputFromPlayer();
	//gameBoard.mark();
	//gameBoard.checkWin();
		
	
	
}
