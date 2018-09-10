package com.paczka

def nums = [1,2,3,4,51,23,5] // <-- zwykla lista
println nums
println nums.class.name

//add by .push
def num = [1,2,3,4,51,23,5]
println num
num.push(99) // <-- dodaje 99 przed wszystko
println num

//add by .putAt
def num1 = [1,2,3,4,51,23,5]
println num1
num1.putAt(0,32) //<-- Stawia 32 na miejscu 0(1)
println num1
//remove by removeAt
num1.removeAt(0)
println num1
//.pop() usuwa ostatni w starej wersji grooviego

def newlist = nums - 1 // <-- usuwa wszystkie 1 z listy
println nums
println newlist

for ( x in nums) {
    println x
}
println nums

//flatten
 nums << [3,4,5]  // <-- Tworzy liste w liscie
 nums << [1,2]
println nums // <-- Tutaj lista jest wyświetlana jako lista w liscie
println nums.flatten() // <-- Tutaj tworzy jedna wielka liste jako calosc

// unique()
println nums.unique() // wyświetla tylko unikalne wartosci w liscie