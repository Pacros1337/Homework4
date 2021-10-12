package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        int[] denominals = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(solve(157, denominals));
    }

    public static Map<Integer, Integer> solve(int startingValue, int[] denominals) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int remaining = startingValue;
        for (int currentDenominal : denominals) {
            if (currentDenominal > remaining) continue;
            map.put(currentDenominal, remaining / currentDenominal);
            remaining %= currentDenominal;
            if (remaining == 0) break;
        }
        return map;
    }
}
