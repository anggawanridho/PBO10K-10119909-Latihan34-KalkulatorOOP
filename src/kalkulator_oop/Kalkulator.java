package kalkulator_oop;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Kalkulator {
    Scanner scanner = new Scanner(System.in);
    public Double value1, value2;

    public Double addValue(){
        return value1 + value2;
    }
    public Double subValue(){
        return value1 - value2;
    }
    public Double multiplyValue() {
        return value1 * value2;
    }
    public Double divideValue() {
        return value1 / value2;
    }
    public Double divValue() {
        return value1 % value2;
    }
}