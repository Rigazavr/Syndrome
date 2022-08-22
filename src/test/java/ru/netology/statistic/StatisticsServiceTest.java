package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    @Test
     void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
     @Test
     void findMaxIncome() {
         StatisticsService service = new StatisticsService();

         long[] incomesInBillions = {5, 9, 15, 18, 2, 16, 28};
         long expected = 28;

         long actual = service.findMax(incomesInBillions);

         assertEquals(expected, actual);
     }
}
