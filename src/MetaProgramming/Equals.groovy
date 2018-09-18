package MetaProgramming

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Person3 {

    String first
    String last
    String email
}

Person3 p1 = new Person3(first:"Karol", last:"Herzyk")
Person3 p2 = new Person3(first:"Karol", last:"Herzyk")

assert p1 == p2 // <-- asercja nie zadziala poniewaz zastosowany zostal @qualsAndHashCode