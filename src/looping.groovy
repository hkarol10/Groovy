
List numbers = [1,2,3]
while(numbers) {
    numbers.remove(0)
}

assert numbers == []


for(Integer i in 1..10) {
    println i
}

Integer a = -1
while (true){   //<-- inf loop
    a++
    break       //<-- wyjscie z petli
}

assert a == 0