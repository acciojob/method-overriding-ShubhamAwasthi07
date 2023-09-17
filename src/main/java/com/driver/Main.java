package com.driver;

public class Main {

    public static void main(String[] args){
        ClassB obj = new ClassB();
        String val = obj.meth();

        String res = obj.meth();
        System.out.println(res);
    }


}