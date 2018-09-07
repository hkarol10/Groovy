
def boo() {
    throw new Exception("Foo Exception")
}

List log = []

try {
    boo()
}catch (Exception e) {
    log << e.message
} finally {
    log<< 'finally'
}

println log