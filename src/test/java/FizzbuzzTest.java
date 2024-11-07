import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.SergiFactoriaF5.Fizzbuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    @DisplayName("Test if number is divisible by 3")
    void test_whenTheNumberIsDivisibleByThree_thenReturnFizz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(9);
        // Then
        assertEquals("Fizz", result);
    }

    @Test
    @DisplayName("Test if number is divisible by 5")
    void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(10);
        // Then
        assertEquals("Buzz", result);
    }


    @Test
    @DisplayName("Test if number is divisible by 3 and 5")
    void test_whenTheNumberIsDivisibleByThreeAndFive_thenReturnFizzBuzz() {
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber((15));
        //Then
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Test if number is not divisible by 3 neither 5")
    void test_whenTheNumberIsNotDivisibleByThreeNeitherFive_thenReturnSameNumber(){
        //Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        int number = 7;
        String result = fizzbuzz.checkNumber(number);
        //Then
        assertEquals("7", result);
    }


}

