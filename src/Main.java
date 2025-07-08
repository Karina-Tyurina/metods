//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 ");
        checkYear(2021);
        System.out.println("Задача 2 ");
        checkVersionForTwo(0, 2025);
        System.out.println("Задача 3");
        System.out.println(deliveryDaysInfo(65));
    }

    //задача 1
    public static void checkYear(int year) {
        if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year > 1584 && year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //задача 2
    public static void checkVersionForTwo(int clientOSForTsk2, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOSForTsk2 == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSForTsk2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSForTsk2 == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (clientOSForTsk2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //задача 3
    public static String deliveryDaysInfo(int deliveryDistance) {
        int deliveryPeriod = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryPeriod = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryPeriod = 3;
        } else if (deliveryDistance > 100) {
            return "Доставки нет";
        }
        return "Потребуется дней: " + deliveryPeriod;
    }
}