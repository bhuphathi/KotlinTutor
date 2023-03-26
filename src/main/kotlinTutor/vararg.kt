fun vararg(vararg nums: Int) {
    println("\nvararg: $nums")
    println(nums.forEach {
        println(it)
    })
    for (num in nums) {
        println(num)
    }
}
