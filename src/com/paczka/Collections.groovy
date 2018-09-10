package com.paczka
// How to use collections in groovy


Range x = 1..10 // <-- przedział od do
println x
println x.class.name
println x.from
println x.to

Range r = 1..<10
println r
println r.class.name
println r.from
println r.to

//sprawdza czy zawiera
// assert(przedzial).contains(argument)
assert (0..10).contains(0)    // <-- zawiera
//assert (0..10).contains(-1) // <-- wywali program bo nie zawiera

// Data
Date today = new Date() // <-- pobiera aktualną date
Date oneWeekAway = today + 7
println today
println oneWeekAway

Range days = today..oneWeekAway
println days
