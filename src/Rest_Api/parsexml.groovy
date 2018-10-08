package Rest_Api

def xml = '''
    <sports>
        <sport>
            <name>Football</name>
        </sport>
   </sports>
'''

def sports = new XmlSlurper().praseText(xml)

println sports.getClass().getName()
println sports.sport.name

