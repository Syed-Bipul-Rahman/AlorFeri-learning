class Person(val firstName: String, val lastName: String) {


    var nickName: String? = null
        //setter and getter
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }


    // Primary constructor

    // Secondary constructor 1
    constructor(firstName: String) : this(firstName, "") {

    }

    init {
        println("init 1")

    }

    // Secondary constructor 2
    constructor() : this("Unknown") {

    }

    init {
        println("init 2")

    }


    fun printInfo() {

        var nickNametoPrint = nickName ?: "no nickname"


        println("User : $firstName ($nickNametoPrint) $lastName ")

    }

    fun isAlive(isAlive: Boolean = true): String {
        val alive = if (isAlive) "User is alive" else "User died"
        println(alive)
        return alive
    }

}