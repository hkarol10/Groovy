package MetaProgramming
/*
@Builder
@ToString(inculdeNames = true)
 class Dev {

     String Pierwsze
     String Drugie
     String email
     String zamowienie
     Date kiedypodac
     List listadan

 }

Dev karol = Dev
    .builder()
    .Pierwsze("Karol")
    .Drugie("Grzegorz")
    .email("gmail")
    .zamowienie("hamburger")
    .kiedyodac(new Date())
    .listadan(["hamburger","frytki"])
    .build()

println karol
assert karol.pierwsze == "Karol"
*/