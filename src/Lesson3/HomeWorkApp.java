package Lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {

    }

    static public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static public void checkSumSign() {
        int a = 10, b = 10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static public void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    static public void compareNumbers() {
        int a = 10, b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    static public boolean sumNumbers(int num1, int num2) {
        if (num1 + num2 >= 10 && num1 + num2 <= 20) {
            return true;
        }
        return false;
    }

    static public void posOrNegNum1(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else System.out.println("Число положительное");
    }

    static public boolean posOrNegNum2(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }

    static public void writeAndPrint(String text, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(text);
        }
    }

    static boolean MethodOfTheYear(int a) {
        return (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0));
    }
}
