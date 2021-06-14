

//QUESTION 4 & 5


fun main(){
    var person : Person = Person("Kings", "mom", 29, "President", "South Kora" )
    var house : House = House(2,2,3,5,2)
    var car : Car = Car("kia", "Black",344783,4, 2)
    var family : Family = Family("Ken","Rita","Ruth","Victor","Emeka")
    var church : Church = Church( 2,3,5,55,6)
    println("The details contains ${person.firstName}, ${person.lastName}, ${person.age},${person.position} ${person.country}")
    println("The details of your house ${house.masterRoom} ${house.parlour} ${house.kitchen}, ${house.babyRoom},${house.toilet}")
    println("The details of my cars ${car.carName}, ${car.carColor}, ${car.carDoors}, ${car.carSeat},${car.carPlateNum}")
    println("The details of my Family ${family.fatherName}, ${family.motherName}, ${family.sisterName}, ${family.brotherName},${family.uncleName}")
    println("My church details ${church.pastorsDept},${church.usherDept},${church.choirDept},${church.childrenDept}, ${church.membersDept}")
}

class Person{
    var firstName: String = " "
    var lastName: String = " "
    var age : Int = 0
    var position: String = " "
    var country : String = " "

    constructor(firstName:String, lastName: String, age: Int,position: String, country: String){
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.position =position
        this.country = country


    }

}
class House{
    var masterRoom: Int = 0
    var kitchen : Int = 0
    var parlour : Int = 0
    var toilet: Int = 0
    var babyRoom : Int = 0


    constructor(masterRoom : Int, kitchen : Int, parlour : Int, toilet : Int, babyRoom : Int){
        this.masterRoom = masterRoom
        this.kitchen = kitchen
        this.parlour = parlour
        this.babyRoom = babyRoom
        this.toilet = toilet
    }
}
class Car{
    var carName : String  = ""
    var carColor : String = ""
    var carPlateNum : Int = 0
    var carSeat: Int = 0
    var carDoors : Int = 0

    constructor( carName : String, carColor : String, carPlateNum : Int, carSeat : Int, carDoors: Int){
        this.carName = carName
        this.carColor = carColor
        this.carDoors = carDoors
        this.carPlateNum = carPlateNum
        this.carSeat = carSeat

    }

}
class Family{
    var fatherName: String = ""
    var motherName : String = ""
    var sisterName : String  = ""
    var brotherName: String = ""
    var uncleName : String = ""

    constructor( fatherName: String, motherName : String, sisterName : String, brotherName: String, uncleName : String ){
        this.fatherName = fatherName
        this.motherName = motherName
        this.sisterName = sisterName
        this.brotherName = brotherName
        this.uncleName = uncleName

    }
}
class Church{
    var pastorsDept: Int = 0
    var usherDept : Int = 0
    var choirDept : Int  = 0
    var membersDept: Int = 0
    var childrenDept: Int = 0


    constructor( pastorsDept: Int, usherDept : Int, choirDept : Int, membersDept : Int, childrenDept :Int ){
        this.pastorsDept = pastorsDept
        this.usherDept = usherDept
        this.choirDept = choirDept
        this.membersDept = membersDept
        this.childrenDept = childrenDept

    }
}

