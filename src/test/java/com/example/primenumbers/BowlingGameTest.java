package com.example.primenumbers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private BowlingGame g;

    void rollMany(int n, int pins, BowlingGame g) {
        for (int i = 0; i < n; i++) g.roll(pins);
    }

    @Before
    public void setUp() {
        this.g = new BowlingGame();
    }

    @Test
    //zwraca zero jesli w każdym rzucie chybimy
    public void testZero() {
        rollMany(20, 0, g);
        assertEquals(0, g.score());
    }

    //powinno zwrocic 20 jesli w kazdym rzucie trafimy po jednym kręglu
    @Test
    public void testAllOnes() {
        rollMany(20, 1, g);
        assertEquals(20, g.score());
    }


    //powinno zwrocic 16 kiedy w pierwszej turze trafimy spare, a nastpępnie trzy kręgle
    @Test
    public void shouldReturnSixTeenWhenSpareIsKnockDown() {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(17, 0, g);
        assertEquals(16, g.score());
    }

    //jesli w pierwszym rzucie jest strike, następnie 3 i 4 kręgle to powinno wyjsc 24
    @Test
    public void testOneStrike() {
        g.roll(10);
        g.roll(3);
        g.roll(4);
        rollMany(16, 0, g);
        assertEquals(24, g.score());
    }


    //jesli w kazdym rzucie strike to powinno byc 300
    @Test
    public void testPerfectGame() {
        rollMany(12, 10, g);
        assertEquals(300, g.score());
    }
}