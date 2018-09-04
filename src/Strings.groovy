


def c2 = 'c'
println c2.class

def str2 = 'this is a string'
println str2.class

// interpolation string

String name = 'Karol'
String msg = 'Hello ' + name + '...'
println msg
String msg2 = "hello ${name}"
println msg2

String msg3 = 'Hello ${name}'
println msg3

String msg4 = "Możemy napisac tutaj dowolne wyrazenie ${1+1}"
println msg4


// Multiline String

def x = '''
Wlazl kotek na plotek
i
mruga
he
he
he
niedluga 
'''

println x

//dolar slashy

def folder = "C:\\gat\\gat\\gat"
println folder
def folder2 = $/C:\gat\gat\gat/$
println folder2