/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_CodeWars;

import java.math.BigInteger;

/**
 *
 * @author rizan
 */
public class Last_digit_of_a_large_number {
public static int lastDigit(BigInteger n1, BigInteger n2) { 
        // Jika n1 adalah nol, maka hasilnya pasti nol
        if (n1.equals(BigInteger.ZERO)) {
            return 0;
        }

        // Jika n2 adalah nol, maka hasilnya pasti satu
        if (n2.equals(BigInteger.ZERO)) {
            return 1;
        }

        // Menghitung pangkat n1^n2
        BigInteger result = n1.modPow(n2, BigInteger.TEN);
        // Mengambil digit terakhir dari hasil pangkat
        return result.intValue() % 10;
    }      

    public static void main(String[] args) {
        // Contoh pemanggilan dan pencetakan hasil
        BigInteger base = new BigInteger("2");
        BigInteger exponent = new BigInteger("7");
        int result = lastDigit(base, exponent);
        System.out.println("Last digit: " + result);
    }
}