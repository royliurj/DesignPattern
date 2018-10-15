package com.roy.prototype;

import com.roy.prototype.business.Resume;
import com.roy.prototype.business.WorkExperience;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Resume resume = new Resume();
        resume.setName("Roy");
        resume.setAge(25);

        resume.setWorkExperience("北京A集团");

        System.out.println(resume.toString());

        Resume resume1 = resume.clone();
        resume1.setAge(26);

        resume1.setWorkExperience("北京B集团");

        System.out.println(resume1);
        System.out.println(resume);

    }
}
