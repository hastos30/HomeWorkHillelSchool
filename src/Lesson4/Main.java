package Lesson4;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        wordSwapZ();
        calculator();
    }

    public static void wordSwapZ() {
        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

        char[] textChar = text.toCharArray();

        for (int i = 0; i < textChar.length; i++) {
            char c = textChar[i];
            if (Character.isUpperCase(c)) {
                textChar[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                textChar[i] = Character.toUpperCase(c);
            }
        }
        String newText = new String(textChar);
        newText = newText.replace("z", "*");

        System.out.println(newText);
    }

    public static void calculator() {
        boolean start = false;
        do {
            double num1 = getNumber();
            char operation = getOperation();
            double num2 = getNumber();

            if (operation == '+') {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (operation == '-') {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (operation == '*') {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (operation == '/') {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Ошибка ввода! Повторите операцию!");
                calculator();
            }
            System.out.println("Желаете подсчитать еще раз? 1 - Да, 2 - Нет");
            if (scanner.nextInt() == 1) {
                System.out.println("___________________________________________");
                start = true;
            } else start = false;
        } while (start);

    }

    public static double getNumber() {
        System.out.println("Введите число: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода числа! Попробуйте еще раз...");
            scanner.next();
            number = scanner.nextDouble();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Введите операцию: (+) (-) (*) (/)");
        char operation;

        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода операции! Попробуйте еще раз...");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}
