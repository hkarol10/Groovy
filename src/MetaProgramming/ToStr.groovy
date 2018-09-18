package MetaProgramming

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["mail"]) // <-- excludes wyklucza wybrany obiekt z transformacji

class Person {

    String first
    String last
    String mail

}
