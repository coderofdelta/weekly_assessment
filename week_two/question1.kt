fun main(args: Array<String>) {

    val number = 100
    val number2 = 120
    val number3 = 189
    val number4 = 167
    val number5 = 184
    val number6 = 132
    val number7 = 121
    val number8 = 132
    val number9 = 183
    val number10 = 1842


    // if expression
    if (number % 2 == 0)
        if (number2 % 2 == 3)
            if (number3 % 2 == 0)
                if (number4 % 2 == 0)
                    if (number5 % 2 == 0)
                        if (number6 % 2 == 0)
                            if (number7 % 2 == 0)
                                if (number8 % 2 == 0)
                                    if (number9 % 2 == 0)
                                        if (number10 % 2 == 0)

                                            when (number) {
                                              in 1..3  -> println("this is cool")
                                            }
    when (number3) {
        in 170..189 -> println("this is the best")
    }
    when (number9) {
        in 189..290 -> println("The roll of everything")
    }
    when (number4){
        in 160..200 -> println("This is red")
    }
    when (number6) {
        in 390..400 -> println("This is Black")
    }
}