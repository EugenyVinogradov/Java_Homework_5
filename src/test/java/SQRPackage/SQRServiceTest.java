package SQRPackage;

import SQRPackage.SQRService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "countSquareSearchWorkValues,100,300,8",
                    "countSquareSearchUnderLowBorder,0,99,0",
                    "countSquareSearchLowBorder,0,100,1",
                    "countSquareSearchOverLowBorder,0,101,1",
                    "countSquareSearchUnderHiBorder,9800,10000,1",
                    "countSquareSearchHiBorder,9801,10000,1",
                    "countSquareSearchOverHiBorder,9802,10000,0",
                    "countSquareSearchNegativeBorder,-10000,0,0"
            },
            delimiter = ','
    )

    void countSquareSearchWorkValues(String test, long minBorder, long maxBorder, long expected) {
        SQRService service = new SQRService();
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }

}