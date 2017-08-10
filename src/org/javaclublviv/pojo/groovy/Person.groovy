package org.javaclublviv.pojo.groovy

class Person {
    String firstName

    String lastName

    int age

    void greet1() {
        println "Hello. My Name is ${firstName} ${getLastName()}. I'm $age years old."
    }

    void greet2() {
        println "German: Hello. My Name is ${firstName} ${getLastName()}. I'm $age years old."
    }


//    String getFirstName() {
//        return firstName
//    }
//
    void setFirstName(String firstName) {
        System.out.println("executing setFirstName()...")
        this.firstName = firstName
    }
//
//    String getLastName() {
//        return lastName
//    }
//
//    void setLastName(String lastName) {
//        this.lastName = lastName
//    }
//
//    int getAge() {
//        return age
//    }
//
//    void setAge(int age) {
//        this.age = age
//    }
}

