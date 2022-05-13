package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min;
        int max;
        int result = service.amountMathSquare(min = 700, max = 6750);
        System.out.println(result);
    }
}
