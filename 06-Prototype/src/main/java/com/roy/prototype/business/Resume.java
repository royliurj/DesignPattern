package com.roy.prototype.business;

public class Resume implements Cloneable {

    private String name;
    private Integer age;
    private WorkExperience workExperience;

    public Resume(){
        workExperience = new WorkExperience();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void setWorkExperience(String company) {
        this.workExperience.setCompany(company);
    }

    public void setWorkExperience(WorkExperience workExperience){
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        try{
            Resume resume = (Resume)super.clone();
            resume.setWorkExperience(this.workExperience.clone());
            return resume;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
