package com.tictactoe.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest
{
	Game testGame = new Game();

        @Test
        public void testPlayer1Test(){
		assertSame('x', testGame.player1.getSymbol());
        }
        @Test
        public void testPlayer2Test(){
                assertSame('o', testGame.player2.getSymbol());
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
        
        @Test
	public void testInputFromPlayer2() {
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.changePlayersTurn();
	    assertEquals(false, testGame2.inputFromPlayer(0,0));
	}

        @Test
	public void testInputFromPlayer3() {
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    assertEquals(false, testGame2.inputFromPlayer(0,0));
	}
        
        @Test
	public void testHorizontalWin(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.inputFromPlayer(0,1);
	    testGame2.inputFromPlayer(0,2);
	    assertEquals(true, testGame2.checkWin());
	}

        @Test
	public void testHorizontalWin2(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.inputFromPlayer(0,1);
	    testGame2.inputFromPlayer(0,2);
	    assertEquals(true, testGame2.checkWin());
	}

        @Test
	public void testHorizontalWin3(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(1,0);
	    testGame2.inputFromPlayer(1,1);
	    testGame2.inputFromPlayer(1,2);
	    assertEquals(true, testGame2.checkWin());
	}

        
        @Test
	public void testNotWin(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.inputFromPlayer(2,2);
	    testGame2.inputFromPlayer(0,2);
	    assertEquals(false, testGame2.checkWin());
	}

        @Test
	public void testVerticalWin(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.inputFromPlayer(0,1);
	    testGame2.inputFromPlayer(0,2);
	    assertEquals(true, testGame2.checkWin());
	}
    
        @Test
	public void testVerticalWin2(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(1,0);
	    testGame2.inputFromPlayer(1,1);
	    testGame2.inputFromPlayer(1,2);
	    assertEquals(true, testGame2.checkWin());
	}
    

        @Test
	public void testVerticalWin3(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(2,0);
	    testGame2.inputFromPlayer(2,1);
	    testGame2.inputFromPlayer(2,2);
	    assertEquals(true, testGame2.checkWin());
	}


        @Test
	public void testRightDiagonalWin(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(0,0);
	    testGame2.inputFromPlayer(1,1);
	    testGame2.inputFromPlayer(2,2);
	    assertEquals(true, testGame2.checkWin());
	}

        @Test
	public void testLeftDiagonalWin(){
	    Game testGame2 = new Game();
	    testGame2.inputFromPlayer(2,0);
	    testGame2.inputFromPlayer(1,1);
	    testGame2.inputFromPlayer(0,2);
	    assertEquals(true, testGame2.checkWin());
	}


}
