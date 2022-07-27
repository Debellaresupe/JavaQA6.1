public class StartService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }
    public long average(long[] sales) {
        return sum(sales) / 12;
    }
    public int countBelowAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
        }
    public int countUpAvg(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
//    public int minSales(long[] sales) {
//        int minMonth = 0;
//        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
//        for (long sale : sales) {
//            // sales[minMonth] - продажи в месяце minMonth
//            // sale - продажи в рассматриваемом месяце
//            if (sale <= sales[minMonth]) {
//                minMonth = month;
//            }
//            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
//        }
//        return minMonth + 1;
//    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
}
