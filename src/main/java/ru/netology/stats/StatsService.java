package ru.netology.stats;

public class StatsService {

        public int calculateSumSale (int [] sales){
        int sum =0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageCostSales (int [] sales){
            return calculateSumSale (sales) / sales.length;
    }

    public int numberMonthMaxSales (int [] sales){
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth=month;
            }
            month=month +1;
        }
        return maxMonth+1;
    }

    public int numberMonthMinSales (int [] sales){
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth=month;
            }
            month=month +1;
        }
        return minMonth+1;
    }

    public int salesBelowAverage (int [] sales){
            int month = 0;
            int averageCost = calculateAverageCostSales (sales);
            for (int sale : sales)
            if (sale < calculateAverageCostSales (sales)) {
               month=month+1;
            }
        return month;
    }

    public int salesOverAverage (int [] sales){
        int month = 0;
        int averageCost = calculateAverageCostSales (sales);
        for (int sale : sales)
            if (sale > calculateAverageCostSales (sales)) {
                month=month+1;
            }
        return month;
    }

}
