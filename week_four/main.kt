fun main() {
    println(spacedEvenly(2, 4, 6))
    println(spacedEvenly(4, 6, 2))
    println(spacedEvenly(4, 6, 3))
}

fun spacedEvenly (_a: Int, _b: Int, _c: Int): Boolean {
    var spac: Int

    // Reassigning to local variables since Kotlin arguments are read only
    var a = _a
    var b = _b
    var c = _c

    if(a > b) {
        spac = a
        a = b
        b = spac
    }

    if(b > c) {
        spac = b
        b = c
        c = spac
    }

    if(a > b) {
        spac = a
        a = b
        b = spac
    }

    return b - a == c - b
}