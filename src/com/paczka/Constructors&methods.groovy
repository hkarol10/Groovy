package com.paczka

@groovy.transform.ToString
class Person1 {

    String first,last
    //constructor
}

Person1 p = new Person1(first: 'Karol', last:'Herzyk')
println p