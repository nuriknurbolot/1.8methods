package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printISLeapYear(2015);
        System.out.println("Дней для доставки " + calculateDeliveryDays(90));
        validateString("aabccddefgghiijjkk");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
//задание 1
    public static void printISLeapYear(int year) {
        boolean leapYear = isLeap(year);
        if (leapYear) {
            System.out.println(year + " -високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

        public static boolean isLeap ( int year){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        // задание 2
    public static void printVersionSuggestion(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите lite-версию для iOS");
            } else {
                System.out.println("Установите версию для iOS");
            }
        } else  {
            if (deviceYear < currentYear) {
                System.out.println("Установите lite-версию для Android");
            } else {
                System.out.println("Установите версию для Android");
            }
        }
    }
    // задание 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }
    //задание 4
    public static void validateString(String str) {
        char[] letters = str.toCharArray();

        char prevChar = Character.MAX_VALUE;

        for (char c: letters) {
            if (c == prevChar) {
                System.out.println("Дубликаты найден:" + c);
                return;
            }
            prevChar = c;
        }
        System.out.println("Дубликатов не найдено");
    }
    // задание 5
    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
        }
    }
}
