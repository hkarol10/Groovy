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

//remove by removeAt
println 
num1.removeAt(0)

