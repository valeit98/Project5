package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/counterVacation.csv")
    public void testCalculate(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        System.out.println("Количество свободных месяцев: " + actual);//расчет,
        //сравнение ожидаемого результат и фактического и вывод количества свободных месяцев
    }
}