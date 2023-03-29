package org.xin.algos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.xin.algos.Math.lucasSeriesIteration;

public class LucasTest {

    @Test
    public void test1() {
        assertEquals(2, lucasSeriesIteration(1));
    }

    @Test
    public void test2() {
        assertEquals(1, lucasSeriesIteration(2));
    }
    @Test
    public void test3() {
        assertEquals(3, lucasSeriesIteration(3));
    }
    @Test
    public void test4() {
        assertEquals(4, lucasSeriesIteration(4));
    }
    @Test
    public void test5() {
        assertEquals(7, lucasSeriesIteration(5));
    }
    @Test
    public void test6() {
        assertEquals(11, lucasSeriesIteration(6));
    }
    @Test
    public void test7() {
        assertEquals(123, lucasSeriesIteration(11));
    }

}
