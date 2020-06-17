package com.test;

/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/5/9
 * @Introduce
 */

public class Test {
    private int num;

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Test{" +
                "num=" + num +
                '}';
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = a;
        System.out.println("a="+a+";b="+b);
        System.out.println(a==b);
        a=4;
        System.out.println("a="+a+";b="+b);
        System.out.println(a==b);
        Test test1 = new Test();
        test1.setNum(1);
        Test test2 = test1;
        System.out.println("test1的值为："+test1);
        System.out.println("test2的值为："+test2);
        test1.setNum(0);
        System.out.println("test1的值为："+test1);
        System.out.println("test2的值为："+test2);
        Integer c = -128;
        Integer d = -128;
        System.out.println(c==d);
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer1 == integer2);
        Short dou1 = 1;
        Short dou2 = 1;
        System.out.println(dou1 == dou2);
    }
}
