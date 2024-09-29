import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BusinessLogicTest {

    @Test
    fun testCalculateArea() {
        val logic = BusinessLogic()
        assertEquals(20, logic.calculateArea(5, 4))
        assertEquals(0, logic.calculateArea(0, 10))
    }

    @Test
    fun testIsAlphabetic() {
        val logic = BusinessLogic()
        assertTrue(logic.isAlphabetic("hello"))
        assertFalse(logic.isAlphabetic("hello123"))
        assertFalse(logic.isAlphabetic(null))
    }

    @Test
    fun testMultiplyTwoNumbers() {
        val logic = BusinessLogic()
        assertEquals(6, logic.multiplyTwoNumbers(2, 3))
        assertEquals(0, logic.multiplyTwoNumbers(0, 5))
        assertEquals(-8, logic.multiplyTwoNumbers(-2, 4))
    }

    @Test
    fun testCalculateInterest() {
        val logic = BusinessLogic()
        assertEquals(200.0, logic.calculateInterest(1000.0, 20.0))
        assertEquals(0.0, logic.calculateInterest(0.0, 5.0))
        assertEquals(25.0, logic.calculateInterest(500.0, 5.0))
    }

    @Test
    fun testIsEven() {
        val logic = BusinessLogic()
        assertTrue(logic.isEven(4))
        assertFalse(logic.isEven(3))
    }

    @Test
    fun testInsecureLogin() {
        val logic = VulnerableCode()
        assertTrue(logic.insecureLogin("user", "password123"))
        assertFalse(logic.insecureLogin("user", "wrongpassword"))
    }
}
