
def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "Moj pierwszy debug..")

def debugLog = log.curry("DEBUG")
debugLog(new Date(),"This is another debug...")
debugLog(new Date(),"This is another debug23145...")