fun whenCondition(a: Int = 10) {
//    var a = 10
    when {
        a > 5 -> println("a: $a gt 5")
        a < 5 -> println("lt 5")
        else -> println("else part")
    }
    //when contains
    when (a) {
        7, 8, 10 -> println("a: $a contains 7 or 8 or 10")
        5 -> println("a = 5")
        else -> println("else part")
    }
    when (a) {
        5 -> println("a = 5")
        in 1..10 -> println("a: $a in 1 to 10")
        else -> println("else part")
    }
    //when in
    val b = a + 1
    when (b) {
        5 -> println("a = 5")
        !in 1..10 -> println("a: $b not in 1 to 10")
        else -> {
            "multiple statements with curley brace"
            println("else part")
        }
    }
    //assigning to variable
    val t = when (b) {
        5 -> println("a = 5")
        in 1..10 -> println("a: $b not in 1 to 10")
        else -> {
            println("else part")
            "else part multiple statements with curley brace"
        }
    }
    println("a: $b assigned to var in when condition, $t")
}
