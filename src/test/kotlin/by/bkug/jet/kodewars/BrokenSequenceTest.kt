package by.bkug.jet.kodewars

import org.junit.Assert.assertEquals
import org.junit.Test

class BrokenSequenceTest {
    @Test fun test1() {
        assertEquals(4, BrokenSequence().findMissingNumber("1 2 3 5"))
    }

    @Test fun test2() {
        assertEquals(2, BrokenSequence().findMissingNumber("1 3"))
    }

    @Test fun test3() {
        assertEquals(0, BrokenSequence().findMissingNumber(""))
    }

    @Test fun test4() {
        assertEquals(1, BrokenSequence().findMissingNumber("2 1 4 3 a"))
    }
}
