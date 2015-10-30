package com.tictactoe.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacToeTest{

    @Test
    public void greetResultsInHello() {
        assertSame(1, 1); }
    @Test
	//Test if Board class creates 3*3 char array
    public void newBoard() {
	char[][] testArray = new char[3][3];
	Board testBoard = new Board();
        assertArrayEquals(testArray, testBoard.getBoard());
    }
    @Test
    public void markBoard() {
	char[][] testArray = new char[3][3];
	testArray[1][2] = 'x';
	Board testBoard = new Board();
	testBoard.mark(1, 2, 'x');
	assertArrayEquals(testArray, testBoard.getBoard());
    }


}
