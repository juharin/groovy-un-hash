println hash(args[0])

BigInteger hash(String tehString) {

    BigInteger h   = 7
    String letters = "acdegilmnoprstuw"

    for (letter in tehString) {
        h = (h * 37 + letters.indexOf(letter))
    }
    
    return h
}
