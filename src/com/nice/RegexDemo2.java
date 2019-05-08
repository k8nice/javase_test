package com.nice;

public class RegexDemo2 {
    public static void main(String[] args) {
//        functionDemo1();
//        functionDemo_2();
//        functionDemo_3();
          functionDemo_4();
    }

    public static void functionDemo_4() {
        String str = "123tttt456xxxxxx789";
        String[] names = str.split("(.)\\1+");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_3() {
        String str = "zhangsan.xiaoqiang.zhaoliu";
        String[] names = str.split("\\.");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_2(){
       String str = "zhangsan   xiaoqiang   zhaoliu";
       String[] names = str.split(" + ");
        for (String name : names) {
            System.out.println(name);
        }

    }

    public static void functionDemo1() {
        //匹配手机号码是否正确
        String tel = "15543266987";
//        String tel = "a15543266987";
        String regex = "1[3-9]\\d{9}";
        boolean b = tel.matches(regex);
        System.out.println(tel+":"+b);
    }


}
