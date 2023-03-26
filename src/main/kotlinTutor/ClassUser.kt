open class ClassUser(name: String, lastName: String, age: Number) {
    var user = "$name $lastName"
    var lastName: String = lastName
    var age = age
    var height: Number
    lateinit var martial: String

    init {
        println("\nclass User init example")
        this.height = 175
        println("'this' keyword in initializer")
    }

    open fun live(): String {
        println("an example of method name in User.live()")
        return "an example of method user.live"
    }
}