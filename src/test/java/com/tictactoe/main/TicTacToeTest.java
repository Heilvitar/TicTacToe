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
        for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
                	testArray[i][j] = '-';
                }
        }

	Board testBoard = new Board();
        assertArrayEquals(testArray, testBoard.getBoard());
    }
    @Test
    public void markBoard() {
	char[][] testArray = new char[3][3];
	for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                        testArray[i][j] = '-';
                }
        }
	testArray[1][2] = 'x';
	Board testBoard = new Board();
	testBoard.mark(1, 2, 'x');
	assertArrayEquals(testArray, testBoard.getBoard());
    }
    @Test
    public void getMarkTest() {
        Board testBoard = new Board();
        testBoard.mark(1, 2, 'x');
        assertSame('x', testBoard.getMark(1, 2));
    }

    @Test
    public void getMarkTestEmpty() {
        Board testBoard = new Board();
        assertSame('-', testBoard.getMark(0, 1));
    }
    

}
