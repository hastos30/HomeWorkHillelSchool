package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        addInfoClient();
    }
    public static void addInfoClient() {
        int percent = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = scanner.nextLine();
        System.out.println("Введите свой депозит: ");
        int deposit = scanner.nextInt();

        int countOneYear = deposit * percent / 100 + deposit;
        int countFiveYear = (deposit * percent / 100 + deposit) * 5;
        int countTenYear = (deposit * percent / 100 + deposit) * 10;

        System.out.println(name + " " + secondName + ", Ваша сумма депозита составляет " + deposit + " гривен");
        System.out.println("1 год депозита сумма увеличиться до" + countOneYear + " гривен");
        System.out.println("5 лет депозита сумма увеличиться до" + countFiveYear + " гривен");
        System.out.println("10 лет депозита сумма увеличиться до" + countTenYear + " гривен");
    }
}
