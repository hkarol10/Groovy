package com.paczka

class Person {

    String firstName, lastName
    def dob
    // private | protected | public
    protected String f1,f2,f3
    private Date createdOn = new Date()

    static welcomeMsg = 'HELLO'
    public static final String WELCOME_MSG = 'HELLO'


    def foo(){
        String msg = "Hello"
        String first = "Karol"
        println "$msg, $firstName"
    }

}

println Person.WELCOME_MSG
