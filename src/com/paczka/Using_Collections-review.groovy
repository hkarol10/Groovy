package com.paczka
//ex 1
def tydzien = ["niedziela","poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota"]
println tydzien
println tydzien.size() //dlugosc
tydzien.removeAt(6) //usuniecie soboty niestety .pop() zostalo zmienione w tej wersji groovigo
println tydzien
tydzien << "sobota" //dodanie soboty
println tydzien
println tydzien[3] //wyswietlenie wtorku przy pomocy indexu

//ex2
Map map = [1:"niedziela",2:"poniedzialek", 3:"wtorek", 4:"sroda", 5:"czwartek", 6:"piatek", 7:"sobota"]
println map
println map.getClass().getName()
println map.size()
println map.values()