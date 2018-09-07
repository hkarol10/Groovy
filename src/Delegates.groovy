
def writer = {
    append 'Karol'
    append 'Zyje w Gliwicach'

}

/*
def append (String s){
    println "append() wywoluje argument $s "
}
*/

        StringBuffer sb = new StringBuffer()
        writer.resolveStrategy = Closure.DELEGATE_FIRST
        writer.delegate = sb
        writer()