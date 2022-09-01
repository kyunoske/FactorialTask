import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTaskTest {

    @Test
    void factorialForTest() {
        //given
        int number = 5;

        //when
        long actual = FactorialTask.factorialFor(number);


        //then
        assertEquals(24, actual);
    }

    @Test
    void factorialWhileTest() {
        //given
        int number = 5;

        //when
        long actual = FactorialTask.factorialWhile(number);


        //then
        assertEquals(24, actual);
    }
}
