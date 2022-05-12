package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "6500,71",
            "100,1",
            "9801,90",
            "0,0",
            "100000,90",
            "-1000,0"
    })
    public void testLimitExpected(int limit, int expected) {
        SQRService service = new SQRService();

        int actual = service.amountMathSquare(limit);
        Assertions.assertEquals(expected, actual);
    }
}
