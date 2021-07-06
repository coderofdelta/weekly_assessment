
fun main(){

    val str = "This just the Beginning "
    println(removeVowels(str))
}
fun removeVowels(S: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return S.filter { it !in vowels }
}