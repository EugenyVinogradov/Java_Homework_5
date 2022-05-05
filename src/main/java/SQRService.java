public class SQRService {
    public long countSquareSearch(long minBorder, long maxBorder) {
        int count = 0;
        int minValue = 10;
        int maxValue = 99;
        while (minValue <= maxValue) {
            if (minValue * minValue >= minBorder) {
                if (minValue * minValue <= maxBorder) {
                    count = count + 1;
                }
            }
            minValue = minValue + 1;
        }
        return (count);
    }
}
