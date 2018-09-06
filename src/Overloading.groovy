/*
//ZADANIE 1
def a = 1
def b = 2
println a+b
println a.plus(b)

def s1 = "hello"
def s2 = ", world!"
println s1.plus(s2)

//ZADANIE 2
class Account {
    BigDecimal balance
    Account plus(Account other){
        new Account(balance: this.balance + other.balance)
    }
    String toString(){
        "Account Balance : $balance"
    }
}
Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println savings + checking


//Zadanie 3

//@groovy.transform.ToString
/*
class Account {

    BigDecimal balance = 0.0
    String type // checking or savings

    BigDecimal deposit (BigDecimal amount) {
        balance += amount
    }

    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }

    BigDecimal plus(Account account){
        this.balance + account.balance
    }

}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println total

*/