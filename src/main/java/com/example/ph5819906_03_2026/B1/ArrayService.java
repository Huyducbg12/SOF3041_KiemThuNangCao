package com.example.ph5819906_03_2026.B1;
public class ArrayService {
    public int calculateSum(int[] numbers) {
        if (numbers == null) return 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}