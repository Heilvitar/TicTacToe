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
 	public void testBoard(){
                assertSame('-', testGame.gameBoard.getBoard()[0][0]);
        }
}
