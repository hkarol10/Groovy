def c = {}

println c.class.name
println c instanceof Closure

def sayHello = { name ->        //Closure jest obiektem i parametrem
    println "hello $name"
}

sayHello('Karol')
/*
list nums = [1,2,3,4,5,123,235]
nums.each ({ num ->                  // each daje wszysstko
    println it                  // it jest predefioniowanym obiektem w Closure
})
*/

