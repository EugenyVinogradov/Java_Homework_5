package SQRPackage;

public class SQRService {
    public long countSquareSearch(long minBorder, long maxBorder) {
        int count = 0;
        int maxValue = 99;
        for (int minValue = 10; minValue <= maxValue; minValue++) {
            if (minValue * minValue >= minBorder) {
                if (minValue * minValue <= maxBorder) {
                    count = count + 1;
                }
            }
        }
        return (count);
    }
}
