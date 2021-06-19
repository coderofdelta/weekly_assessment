//Write a short program that prints the reverse of a string that is supllied.
//you can assume that the string passed will never be empty or null.
//When given the string "Good food", the output should be "doof dooG"

fun main() {

    val food : String = "Good food"
    var name = food

    var result: String = ""
    var reverse = name!!.lastIndex

    while (reverse >= 0) {
        result += name[reverse]
        reverse--
    }
    println("Given name : Good food")
    println("Backward: $result")
}