package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("q");
        try {
            Person person2 = (Person) person.clone();
            person.address.adr = "w";
            int q = 1;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


class Person implements Cloneable {

    Address address;

    Person(String s) {
        this.address = new Address(s);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person2 = (Person) super.clone();
        Address adr2 = (Address) address.clone();
        person2.address = adr2;
        return person2;
    }
}


class Address implements Cloneable {
    String adr;

    public Address(String adr) {
        this.adr = adr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}