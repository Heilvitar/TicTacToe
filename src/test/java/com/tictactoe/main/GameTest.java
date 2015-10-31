package com.tictactoe.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest
{
	Game testGame = new Game();

        @Test
        public void testPlayer1Test(){
		assertSame('x', testGame.player1.getPlayerSymbol());
        }
        @Test
        public void testPlayer2Test(){
                assertSame('o', testGame.player2.getPlayerSymbol());
        }
	@Test	
 	public void testBoard(){
                assertSame('-', testGame.gameBoard.getMark(1, 2));
        }
        @Test
	public void testPlayersTurn(){
		assertSame(testGame.player1, testGame.getCurrentPlayer());
	}
        @Test
	public void testChangePlaeyrsTurn(){
		testGame.changePlayersTurn();
		assertSame(testGame.player2, testGame.getCurrentPlayer());
	}
        @Test	
	public void testInputFromPlayer(){
		testGame.inputFromPlayer(2, 1);
		assertNotEquals('-', testGame.gameBoard.getMark(2,1));
	}
}
