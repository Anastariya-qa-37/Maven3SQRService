import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void RangePositive() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int rangeStart = 200;
        int rangeEnd = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.sqrCount(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void StartRangeNegativeValues() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int rangeStart = -1;
        int rangeEnd = 10;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.sqrCount(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void RangeNegativeValues() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int rangeStart = -100;
        int rangeEnd = -1;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.sqrCount(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void RangeValuesOutsideService() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int rangeStart = 9802;
        int rangeEnd = 105896;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.sqrCount(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void RangeLimitOutsideService() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int rangeStart = 9500;
        int rangeEnd = 10000;
        long expected = 2;

        // вызываем целевой метод:
        long actual = service.sqrCount(rangeStart, rangeEnd);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}
