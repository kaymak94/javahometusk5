package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "700,6750,56",
            "100,200,5",
            "50,99,0",
            "100,9801,90",
            "9802,100000,0",
            "0,0,0",
            "-1000,-1,0"

    })
    public void testLimitExpected(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.amountMathSquare(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
