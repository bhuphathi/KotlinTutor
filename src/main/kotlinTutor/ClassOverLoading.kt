class ClassOverLoading(var name: String, lastName: String, age: Number) {
    var height: Number

    init{
        println("\nclass User2 initializer example")
        this.height = 175
        println("'this' keyword in initializer")
    }
    constructor(name: String): this(name, "lastName", 0){
        println("user2 second constructor")
    }

    constructor(name: String, lastName: String): this(name,lastName,0) {
        println("user2 third constructor")
    }

    fun live () {
        println("an example method name live()")
        "an example of method"
    }
}