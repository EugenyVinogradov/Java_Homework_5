package SQRPackage;

public class SQRService {
    public long countSquareSearch(long minBorder, long maxBorder) {
        int count = 0;
        int minValue = 10;
        int maxValue = 99;
        for (int i = minValue; i <= maxValue; i++) {
            if (minValue * minValue >= minBorder) {
                if (minValue * minValue <= maxBorder) {
                    count++;
                }
            }
            minValue++;
        }
        return (count);
    }
}
