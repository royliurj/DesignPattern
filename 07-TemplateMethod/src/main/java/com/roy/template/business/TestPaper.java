package com.roy.template.business;

public abstract class TestPaper {
    //模板方法1
    public void testQuestion1(){
        System.out.println("题目1：a,b,c,d");
        System.out.println("答案：" + answer1());
    }

    protected abstract String answer1();
    //模板方法1
    public void testQuestion2(){
        System.out.println("题目2：a,b,c,d");
        System.out.println("答案：" + answer2());
    }

    protected abstract String answer2();

}
