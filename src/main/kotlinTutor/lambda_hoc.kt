fun lambdaHoc(initValue: Int, innerFunc: (Int) -> Int): Int {
    return innerFunc(initValue)
}
fun addOne(initValue: Int): Int {
    return (initValue + 1)
}
