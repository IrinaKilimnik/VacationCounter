package ru.netology.services;

public class VacationService {
    public int calculate (int income, int expenses, int threshold) {
        int wallet = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {

            if (wallet >= threshold) {
                // отдыхать
                wallet = wallet - expenses;  // wallet -= expenses;
                wallet = wallet/3;           // wallet /=3;
                counter++;
            }
            else {
                // работать
                wallet = wallet + income;   // wallet += income;
                wallet = wallet - expenses;  // wallet -= expenses;

                // а все вместе можно было: wallet += (income - expenses);
            }
        }
        return counter;
    }
}

