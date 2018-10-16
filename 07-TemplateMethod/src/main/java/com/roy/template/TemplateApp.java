package com.roy.template;

import com.roy.template.business.TestPagerA;
import com.roy.template.business.TestPaper;
import com.roy.template.business.TestPaperB;

public class TemplateApp {

    public static void main(String[] args) {

        System.out.println("学生A抄的试卷：");
        TestPaper paper = new TestPagerA();
        paper.testQuestion1();
        paper.testQuestion2();


        System.out.println("学生B抄的试卷：");
        paper = new TestPaperB();
        paper.testQuestion1();
        paper.testQuestion2();
    }
}
