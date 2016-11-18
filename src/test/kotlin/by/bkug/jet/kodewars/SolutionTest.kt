package by.bkug.jet.kodewars

import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {
    @Test fun solveTest() {
        assertEquals(2, solution(1, 1))
    }

    @Test fun longestTest() {
        assertEquals("aehrsty", longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", longest("inmanylanguages", "theresapairoffunctions"));
    }
}