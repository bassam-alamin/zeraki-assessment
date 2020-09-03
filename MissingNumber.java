package com.company;

public class Main {
    public static void main(String[] args) {
        int array[] = { 3,5,4,1,6};
        int length = array.length;
        int i, total;
        total = (length + 1) * (length + 2) / 2;
        for (i = 0; i < length; i++)
            total -= array[i];
        System.out.println(total);
    }
}
