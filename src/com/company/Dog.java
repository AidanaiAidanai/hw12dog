package com.company;

public class Dog {
    private String name;
    private String motherName;
    private int age;
    void run(){
        System.out.println("every dog can run fast. This is fact");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("age is a never negative number");
        }else{
        this.age = age;}
    }
}
