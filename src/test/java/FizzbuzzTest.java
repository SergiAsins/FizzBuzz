import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.SergiFactoriaF5.Fizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    @DisplayName("Test if number is divisible by 3")
    void test_whenTheNumberIsDivisibleByThree_theReturnFizz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(9);
        // Then
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Test if number is divisible by 5")
    void test_whenTheNumberIsDivisibleByFive_theReturnBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(10);
        // Then
        assertEquals("Buzz", result);
    }


    @Test
    @DisplayName("Test if number is divisible by 5")
    void test_whenTheNumberIsDivisibleByThreeAndFive_theReturnFizzBuzz() {
        //Given

    }

}

