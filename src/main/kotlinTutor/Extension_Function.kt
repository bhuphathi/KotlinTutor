fun Int.isPrime (): Boolean {
    for(i in 2 until this){
        if (this % i == 0){
            println("$this is divisible by $i")
            return false
        }
    }
    return true
}