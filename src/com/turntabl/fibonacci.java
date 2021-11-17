package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class fibonacci{
    public static List<Integer> fib(Integer n){
        Integer initialNum =0;
        Integer currentNum =1;
        Integer counter;

        List<Integer> firstfib = new ArrayList<>(List.of(0));
        List<Integer> secondfib = new ArrayList<>(List.of(0, 1));

        if (n <= 1)
            return firstfib;

        else if (n == 2)
            return secondfib;

        for (counter =2; counter < n; counter++){
            Integer nextNum = initialNum + currentNum;
            initialNum = currentNum;
            currentNum = nextNum;
            secondfib.add(currentNum);
        }
        return secondfib;
    }
}
