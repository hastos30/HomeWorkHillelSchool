package Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        wordSwap();
        solution();
    }

    public static void wordSwap() {
        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] arrayText = text.split("Z");
        for (String word : arrayText) {
            System.out.print(new StringBuffer(word).reverse() + " ");
        }
        System.out.println();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        boolean start;
        do {
            System.out.println("Введите число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите операцию: (+) (-) (*) (/)");
            char operation = scanner.next().charAt(0);

            System.out.println("Введите число: ");
            double num2 = scanner.nextDouble();

            double result = calculator(num1, num2, operation);
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            System.out.println("__________________________");
            System.out.println("Еще раз? 1 - да, 2 - нет");
            if (scanner.nextInt() == 1) {
                start = true;
                System.out.println("__________________________");
            } else start = false;
        } while (start);
    }

    public static double calculator(double number1, double number2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Ошибка ввода! Попробуйте еще раз...");
                result = calculator(number1, number2, operation);
        }
        return result;
    }
}
