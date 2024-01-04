class Person(val firstName: String, val lastName: String) {

    // Primary constructor

    // Secondary constructor 1
    constructor(firstName: String) : this(firstName, "") {
        // Additional initialization logic if needed
    }

    init{
        println("init 1")
    
    }
    // Secondary constructor 2
    constructor() : this("Unknown") {
        // Additional initialization logic if needed
    }
    init{
        println("init 2")
    
    }
    // Other methods or properties can be defined here
}