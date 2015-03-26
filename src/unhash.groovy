println unhash(args[0], args[1])

String unhash(String hashIntAsString, String stringLetterCount) {

    BigInteger bigInt   = hashIntAsString.toBigInteger()
    Integer count       = stringLetterCount.toInteger()
    String letters      = "acdegilmnoprstuw"
    StringBuffer secret = new StringBuffer()

    for (Integer i = 0; i < count; i++) {
        secret << letters[(bigInt % 37)]
        bigInt = bigInt / 37
    }

    return secret.toString().reverse()
}
