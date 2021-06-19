//Write a short program that prints each number from 1 to 100 on a new line.
//For each multiple of 3, print "Fizz" instead of the number.
//For each multiple of 5, print "Buzz" instead of the number.
//For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number

fun main(){
    var n :Int = 100
    var i : Int = 1

    // loop for 100 times
    for  (i in 1..100 ) {

        //number divisible by 15(divisible by
           // both 3 & 5), print 'FizzBuzz' in
           // place of the number

               if (i % 15 == 0)
            println("FizzBuzz")

        // number divisible by 5, print 'Buzz'
           // in place of the number
        else if (i % 5 == 0)
            println("Buzz" + " ")

        // number divisible by 3, print 'Fizz'
        // in place of the number

        else if (i % 3 == 0)
            println("Fizz" + " ")
        else
            println(i)


      }
    }
