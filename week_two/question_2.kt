fun main(args : Array<String>){

    for(n in 1..100){
        println("Loop: $n")
    }

    for (K in 1..10){

        if(K==4||K==5)
            continue

        println("after continue, Loop: $K")

    }
}
