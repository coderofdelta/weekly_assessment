fun main(args: Array<String>) {
    println(inLove(7,7))
}

fun inLove(petalNum1: Int, petalNum2: Int): Boolean {
    when {
        ((petalNum1%2 == 0) && (petalNum2%2 != 0)) -> return true
        ((petalNum1%2 != 0) && (petalNum2%2 == 0)) -> return true
        else -> return false
    }
}