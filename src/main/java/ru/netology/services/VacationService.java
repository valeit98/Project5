package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;//начальное количество денег
        int months = 0;//начальное количество свободных месяцев

        for (int i = 1; i <= 12; i++) {
            if (money < threshold) {
                money = money + income - expenses;//если сумма на счету меньше пороговой (threshold), то работает,
                //деньги увеличиваются на приход (income) и уменьшаются на траты (expenses)
            } else {
                months = months + 1;
                money = (money - expenses) / 3;//если сумма на счету больше пороговой (threshold), то не работает,
                //количество месяцев увеличивается, из суммы (money) вычитаются траты (expenses) и сумма уменьшается
                //в 3 раза, траты на отдых
            }
        }
        return months;
    }
}