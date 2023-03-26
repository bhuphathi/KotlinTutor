class ClassSetterGetter(name: String, var lastName: String, var age: Number=0) {
    var name = name
        get() {
            println("name getter called...")
            return field
        }
        set(value) {
            println("$value was set to name field")
         field = value
        }
}