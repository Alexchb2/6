package ru.netology.sqr.untitled.services;

public class SQRService {
    int x = 0;

    public int calcNumber(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                x = x + 1;
            }
        }
        return x;
    }
}
