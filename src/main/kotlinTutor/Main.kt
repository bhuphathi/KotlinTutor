fun main() {
    //https://kotlinlang.org/docs/basic-syntax.html
    //'other' in data class- to be studied
    //'with' - used in assigning with ClassWoConstructor
    //'by' - used in ClassWoConstructor
    //'delegation' - used in ClassWoConstructor

    //https://youtu.be/EExSSotojVI?t=38447
    //arrayOf:
    //listOf, mutableListOf:  (methods: zip, unzip, associateWith, associatedBy, flatten)
    //mapOf, mutableMapOf: unique data object with key, value (methods: mapKeys, mapValues)
    //setOf, mutableSetOf: unique data array (methods: map, mapIndexedNotNull)

    ifCondition()
    whenCondition()
    //nullCheck()
    functions()
    vararg(11, 2, 3, 5)
    loops()
    println("\nlambda:")
    println(lambdaHoc(15, ::addOne))
    println(lambdaHoc(15) { l -> l + 15 })

    //example: delegate class, with
    var userProperty = ClassWoConstructor()
    with(userProperty) {
        firstName = "firsTName"
        lastName = "LastName"
    }
    with(userProperty) {
        println("Class Without constructor: $lastName")
        println("Class Without constructor: $firstName")

    }

    //class init function
    var user = ClassUser("test-Name", "last-Name", 30)
    println("User: ${user.user} \nAge: ${user.age} \nHeight: ${user.height}")
    user.live()

    //class overload
    var user2 = ClassOverLoading("User2-name", "last-name")
    println("user2: ${user2.name}\n")

    //Class getter() setter()
    var getSet = ClassSetterGetter("testName", "last-name")
    println("SetterGetter class Name: ${getSet.name}\n")
    getSet.name = "test-name"
    println("SetterGetter class Name: ${getSet.name}")

    //Companion Object (direct use of function without instantiation)
    var result = CalculatorCompanionObj.sum(15, 10)
    println("\nCalculator Sum: $result\n")

    //Singleton
    println(SingletonObject)
    println(SingletonObject)
    println("")

    //ENUM
    print("enum ordinal: ")
    println(ClassEnum.WEST.ordinal)
    for (eValue in ClassEnum.values()) {
        //println(eValue)
        println(eValue.direction)
        println(eValue.distance)
    }

    //Inner Class
    var listView = ClassListInner(arrayOf("list1", "list2", "list3", "list4"))
    listView.ListItem().view(2)

    //Inherited class
    var user3 = ClassUserInherit("user3", "lastName", 4, "bank")
    println(user3.live())

    //Sealed Class
    var success = ClassSealed.SUCCESS("SUCCESS")
    var error = ClassSealed.ERROR("ERROR")
    var rejected = ClassSealed.PROGRESS.REJECTED(1, "REJECTED")
    var resolved = ClassSealed.PROGRESS.RESOLVED(0, "RESOLVED")

    println()
    getError(success)
    getError(error)
    getError(rejected)
    getError(resolved)

    println()

    println(25.isPrime())

    ClassAnonymous.live()

    var mutableset = mutableSetOf("name1", "name2", "name2")
    println(mutableset)
    var mutablemap = mutableMapOf("name1" to "firstName", "name2" to "secondname", "name2" to "thirdname")
    mutablemap.map { println(it.value) }

    var list = listOf(1..10)
    var flat = list.flatten()

    println("list: $list")
    println("flat list: $flat")
}
