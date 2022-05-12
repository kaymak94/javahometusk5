package ru.netology.sqr;

public class SQRService {
    public int amountMathSquare(int limit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= limit) {
                count++;
            }

        }
        return count;
    }

}

