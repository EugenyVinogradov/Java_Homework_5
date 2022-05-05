package SQRPackage;

import SQRPackage.SQRService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    void countSquareSearchWorkValues() {  // Проверка на рабочем диапазоне данных
        SQRService service = new SQRService();
        long minBorder = 100;
        long maxBorder = 300;
        long expected = 8;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }

    @Test
    void countSquareSearchUnderLowBorder() {  // Проверка ниже нижней границы данных
        SQRService service = new SQRService();
        long minBorder = 0;
        long maxBorder = 99;
        long expected = 0;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchLowBorder() {  // Проверка нижней границы
        SQRService service = new SQRService();
        long minBorder = 0;
        long maxBorder = 100;
        long expected = 1;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchOverLowBorder() {  // Проверка выше нижней границы
        SQRService service = new SQRService();
        long minBorder = 0;
        long maxBorder = 101;
        long expected = 1;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchUnderHiBorder() {  // Проверка ниже верхней границы
        SQRService service = new SQRService();
        long minBorder = 9800;
        long maxBorder = 10000;
        long expected = 1;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchHiBorder() {  // Проверка верхней границы
        SQRService service = new SQRService();
        long minBorder = 9801;
        long maxBorder = 10000;
        long expected = 1;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchOverHiBorder() {  // Проверка выше верхней границы
        SQRService service = new SQRService();
        long minBorder = 9802;
        long maxBorder = 10000;
        long expected = 0;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
    @Test
    void countSquareSearchNegativeBorder() {  // Проверка отрицательных границ
        SQRService service = new SQRService();
        long minBorder = -10000;
        long maxBorder = 0;
        long expected = 0;
        long actual = service.countSquareSearch(minBorder, maxBorder);
        assertEquals(expected, actual);
    }
}