package com.paczka
//Funkcja stwierdza czy możesz głosować.

def age
static def glosowanie(age){

    //def age = 13
    println("Czy możesz głosować?")

    if (age < 18)
        println "Nie możesz głosować"
    else
        println "Możesz glosować"
}

//main
glosowanie(18)