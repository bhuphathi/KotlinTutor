sealed class ClassSealed(var message: String){
    class ERROR(message: String): ClassSealed(message)
    class SUCCESS(message: String): ClassSealed(message)
    sealed class PROGRESS(message: String): ClassSealed(message) {
        class RESOLVED (errNo: Int, message: String): PROGRESS(message)
        class REJECTED (errNo: Int, message: String): PROGRESS(message)
    }

    fun showErrMessage(){
        println("The Sealed Class msg is: $message")
    }
}

fun getError(result: ClassSealed){
    when(result){
        is ClassSealed.ERROR -> result.showErrMessage()
        is ClassSealed.PROGRESS.REJECTED -> result.showErrMessage()
        is ClassSealed.PROGRESS.RESOLVED -> result.showErrMessage()
        is ClassSealed.SUCCESS -> result.showErrMessage()
    }
}