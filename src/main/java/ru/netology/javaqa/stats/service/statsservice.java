package ru.netology.javaqa.stats.service;
public class statsservice {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long avarage(long[] sales) {
        return sum(sales) / 12;
    }

    public int maximum(long[] sales) {
        long maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minimum(long[] sales) {
        long minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int bellowMonths(long[] sales) {
        long avarage = avarage(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarage) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveMonths(long[] sales) {
        long avarage = avarage(sales);
        int countera = 0;
        for (long sale : sales) {
            if (sale > avarage) {
                countera++;
            }
        }
        return countera;
    }
}

