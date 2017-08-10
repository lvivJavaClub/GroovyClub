#!/usr/local/bin/groovy .

import org.javaclublviv.pojo.groovy.Person

//Person p = new Person(firstName: "Igor", lastName: "Banadia")

def p = [firstName: "Serg", lastName: "Masyutin", age: 25] as Person

println([:].size())

[1,2].each {p."greet$it"()}

println "Hello Taras"
