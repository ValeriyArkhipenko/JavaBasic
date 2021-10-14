/**
 * Java 1. Homework 3
 * 
 * @author ValeriyArkhipenko
 * @version 14.10.2021
 */


import java.util.Arrays;

class Lesson3Homework {
    
    public static void main(String[] args) {
        // проверки к заданиям
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1: " + Arrays.toString(updatedArray(arr1)));

        System.out.println("2: " + Arrays.toString(fillArray()));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3: " + Arrays.toString(multiplyArray(arr3)));

        for (int[] i : fillMatrix(6)) {
            System.out.println(" 4: " + Arrays.toString(i));
        }

        System.out.println("5: " + Arrays.toString(fillInitialValue(6, 13)));
    }

    // первое задание
    static int[] updatedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

    // второе задание
    static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // третье задание
    static int[] multiplyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    // четвертое задание
    static int[][] fillMatrix(int size) {
        int[][] array = new int[size][size];
        for (int w = 0; w < size; w++) {
            for (int h = 0; h < size; h++) {
                if (w == h) {
                    array[w][h] = 1;
                } else if (w == (size - 1 - h)) {
                    array[w][h] = 1;
                }
            }
        }
        return array;
    }

    // пятое задание (подглядел у Вас в шпаргалке Array.fill)
    static int[] fillInitialValue(int len, int initialValue) {
        int[] result = new int[len];
        Arrays.fill(result, initialValue);
        return result;
        

}
}