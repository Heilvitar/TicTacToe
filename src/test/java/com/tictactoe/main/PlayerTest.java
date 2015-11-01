package com.tictactoe.main;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

    final Player pX = new Player('X');
    final Player pO = new Player('O');

    @Test
    public void testPlayerSymbol_X() {
        assertEquals('X', pX.getSymbol());
    }
    @Test
    public void testPlayerSymbol_O() {
        assertEquals('O', pO.getSymbol());
    }

}
