package ru.netology.sqr.untitled.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/number.csv")

    public void testNumber(int min, int max, int result) {

        SQRService service = new SQRService();
        int number = service.calcNumber(min, max);
        Assertions.assertEquals(result, number);
    }
}
