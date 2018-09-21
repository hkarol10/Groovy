package MetaProgramming

import groovy.transform.TypeChecked

class Per {

    String first
    String last

    String getFullName(){
        "$first $last"
    }

}
