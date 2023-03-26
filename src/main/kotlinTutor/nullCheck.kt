fun nullCheck() {
    var t: String? = "some text"
    t = null
    println(t?.length)

    val a: String? = null
    println(a!!.length)
}
