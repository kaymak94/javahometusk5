package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.amountMathSquare(6500);
        System.out.println(result);
    }
}
