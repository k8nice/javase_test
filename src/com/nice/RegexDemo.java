package com.nice;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "aooob";
//        String reg = "ac?b";
        String reg = "ao+b";
        boolean b = str.matches(reg);
        System.out.println(b);
    }
}
