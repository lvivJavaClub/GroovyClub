package org.javaclublviv.groovy

import org.javaclublviv.pojo.groovy.Person

class HelloGroovy {
    static main(args) {
        Person p = new Person(firstName: "Igor", lastName: "Banadia")

        def p2 = [firstName: "Serg", lastName: "Masyutin", age: 25] as Person

        println([:].size())

        [1,2].each {p."greet$it"()}

//        Person p = new Person()
//
//        p.firstName = "Igor"
//        p.setLastName "Banadiga"
//        p.setAge(new Person())
//
//        p.greet()
//        p.age = 35
////        p.greet()
//
//        def result = sum 5, 12
//        println result
//
//        result = execute 3, 4, sum
//        println result
//
//        result = execute 3, 4, {a, b -> a - b}
//        println result
//
//        println execute(3, 4, product)
//

        test.call()

    }

    static test = { -> println "Hello 2"}

    static execute = {a, b, operation ->
        operation a, b
    }

    static sum = {a, b ->
        def sum = a + b
//        println sum
        sum
    }

    static product = {a, b ->
        def prod = a * b
//        println prod
        prod
    }
}
