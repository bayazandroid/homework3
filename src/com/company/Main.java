package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {2.3, 5.3, 13.1, -1.7, 61.3, -78.5, -98.3, 10.5, 11.7, 13.9, 54.3, 8.7, 9.3, 120.7, 983.9};
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));

        int indexFirstMinusNumber = 0;
        double sum = 0;
        int countOfPositiveNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                indexFirstMinusNumber = i;
                break;
            }
        }

        for (int i = indexFirstMinusNumber; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
                countOfPositiveNumbers++;
            }
        }

        System.out.println(" cумма "+sum);
        System.out.println("количество полож. чисел " + countOfPositiveNumbers);
        System.out.println("позиция первого отрицательн. число "+indexFirstMinusNumber);
        System.out.println("средн. арифм. число " +sum/countOfPositiveNumbers);

    }
}





