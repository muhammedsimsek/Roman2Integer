package com.simsek;

import java.util.LinkedHashMap;

public class Main {

    public static int romanToInt(String s) {
        LinkedHashMap<String, Integer> romans = new LinkedHashMap<>();
        romans.put("CM", 900);
        romans.put("M", 1000);
        romans.put("CD", 400);
        romans.put("D", 500);
        romans.put("XC", 90);
        romans.put("C", 100);
        romans.put("XL", 40);
        romans.put("L", 50);
        romans.put("IX", 9);
        romans.put("X", 10);
        romans.put("IV", 4);
        romans.put("V", 5);
        romans.put("I", 1);

        int retval = 0;
        while (s.length() > 0) {
            for (String r : romans.keySet()) {
                if (s.startsWith(r)) {
                    retval += romans.get(r);
                    s = s.substring(r.length());
                    break;
                }
            }
        }

        return retval;
    }

    public static void main(String[] args) {
        Integer ret = romanToInt("III");
        System.out.println(ret);
    }
}
