fun loops() {
    println("\nLoops:")
    for (n in 1..3) {
        println(n)
    }
    for (n in 1..3 step 2) {
        println(n)
    }
    for (n in 11 until 14) {
        if (n == 12) continue
        println(n)
    }
    for (n in 30 downTo 27 step 2) {
        println(n)
    }
    for (i in 'd'..'g') println(i)

    println()
    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print(element + " ")
    }

    println()
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element")
    }

    println()
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter {
        println(decorations.indexOf(it))
        it[0] == 'p'
    }
    println()
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val lazyFiltered = decorations.asSequence().filter { it[0] == 'p' }
    println("lazy filtered: $lazyFiltered")

    // force evaluation of the lazy list
    val newList = lazyFiltered.toList()
    println("new list: $newList")

    println()
    for (i in decorations.indices) {
        println(decorations[i])
    }

    println()
    for ((index, value) in decorations.withIndex()) {
        println("the element at $index is $value")
    }

    println("\nwhile:")
    var number = 0
    while (number < 3) {
        println(number)
        println(++number)
    }

    println("\ndo while:")
    do {
        println(number++)
    } while (number < 6)

    for (n in 1..10) {
        if (n in 3..5) {
            continue
        }
        println(n)
    }

    println()
    var num = 0
    outerWhile@ while (num < 5) {
        num++
        println(num)

        var i = 0
        while (i < 5) {
            if (i == 2) break@outerWhile
            i++
            println("i: $i")
        }
    }

    var array = arrayOf(1, 2, 3, 10)
    println("\narray: $array")
    array.map { print("$it, ") }

    var list = listOf(10)
    println("\nlist: $list")

    var mutableList = mutableListOf(1, 2, 3..10)
    println("mutable list: $mutableList")

    println(list == mutableList)
    println(list === mutableList)
}