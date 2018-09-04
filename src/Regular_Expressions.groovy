

String slashy = /a\b/
String url = $/http://google.pl/groovy/$

println slashy.class
/*
def pattern = ~/a\b/
println pattern.class
*/
//find & match

def text = "Ciastko orzechowe, z kawalkami czekolady i nutka karmelu"
def pattern = ~/ciastko/
def finder = text =~ pattern
println finder
println finder.size()