package com.dzero;

public class Main {

    public static void main(String[] args) {
        Integervalue();
    }

    public static void Integervalue()
    {
        //Integer类中IntegerCache方法规定的值为[-128,127]时，使用缓存的同一个对象
        Integer v1=-128;
        Integer v2=-128;

        //输出：true
        System.out.print("两个Integer值为-128，对象是否相同：");
        System.out.println(v1==v2);

        //输出：true
        System.out.print("两个Integer值为-128，对象值是否相同：");
        System.out.println(v1.equals(v2));

        Integer w1=128;
        Integer w2=128;

        //输出：false
        System.out.print("两个Integer值为+128，对象是否相同：");
        System.out.println(w1==w2);

        //输出：true
        System.out.print("两个Integer值为+128，对象值是否相同：");
        System.out.println(w1.equals(w2));
    }


}
