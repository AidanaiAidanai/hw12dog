package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog();
        dog.setName("Tuzik");
        dog.setMotherName("Boni");
        dog.setAge(-3);
        dog.run();
        System.out.println("our dog^s name is "+dog.getName());
        System.out.println("his mother is very cute and her name is "+dog.getMotherName());
        System.out.println("Tuzik is "+dog.getAge());

    }
}
