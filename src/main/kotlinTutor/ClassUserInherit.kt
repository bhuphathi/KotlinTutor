class ClassUserInherit(name: String, lasName: String, age: Number, var bankName: String) : ClassUser(name, lasName, age) {
    override fun live(): String {
        println("inherited live function")
        return "return from super: " + super.live()

    }
}