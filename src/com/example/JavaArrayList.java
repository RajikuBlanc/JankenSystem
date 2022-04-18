package com.example;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        List<String> arrayNum = new ArrayList<>();
        int setNum = 50;
        for (int i = 0; i < setNum; i++) {
            Integer iNum = i;
            String sNum = iNum.toString();
            arrayNum.add(sNum);
            if (i % 15 != 0) {
                if (i % 3 == 0) {
                    arrayNum.set(i, "Fizz");
                }
                if (i % 5 == 0) {
                    arrayNum.set(i, "Buzz");
                }
            }
            if (i % 15 == 0) {
                arrayNum.set(i, "fizz buzz");
            }

        }

        for (String num : arrayNum) {
            System.out.println(num);
        }
    }
}
