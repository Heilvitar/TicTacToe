package com.tictactoe.main;

public class Game{
	players player1 = new players('x');
	players player2 = new players('o');

	Board gameBoard = new Board();

	while(true) {
		getcurrentPlayer();
		getInputFromPlayer();
		gameBoard.mark();
		gameBoard.checkWin();
		
	}
	
}
