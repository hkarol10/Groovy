// How to use regular expressions in groovy
String slashy = /a\b/
String url = $/http://google.pl/groovy/$
println slashy.class

//przyklad
def pattern = ~/a\b/
println pattern.class

//find & match
def text = "Ciastko orzechowe, z kawalkami czekolady i nutka karmelu"
def pattern = ~/ciastko/
def finder = text =~ pattern
def matcher = test ==~ pattern // <-- zwraca boolean
println finder
println finder.size()

//Find & replace
def text = " Sernik malinowy z galaretką"
def pattern = ~/malinowy/

text = text.replaceFirst(pattern,"Truskawkowy") // <-- zmienia wyszukaną wartość
println text
