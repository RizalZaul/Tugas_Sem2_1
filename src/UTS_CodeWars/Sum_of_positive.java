/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_CodeWars;

/**
 *
 * @author rizan
 */
public class Sum_of_positive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {9, -7, 8, -3, 7}; // Example array
        int positiveSum = sum(numbers);
        System.out.println("Sum of positive integers: " + positiveSum);
    }
}
