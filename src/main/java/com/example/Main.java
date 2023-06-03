package com.example;

public class Main {
    public static void main(String[] args) {
        elementsMultiplesOf3(new int[]{15, 17, 18, 12, 14});
    }

    public static void elementsMultiplesOf3(int[] ints) {
        int count = 0;
        for (int n : ints) {
            if (n % 3 == 0) {
                count++;
                System.out.println("Элемент, кратный 3: " + n);
            }
        }
    }
}