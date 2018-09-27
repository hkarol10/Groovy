package com.paczka
*/
@ToString(includeNames = true)

class Book {
    String title
    String summary
    List <Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(
        title:"Ksiązka numer jeden"
        summary:"groovy")

*/