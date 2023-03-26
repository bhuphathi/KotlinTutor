fun functions() {
    sendMessage("msg asd-sdf", "name")
    sendMessage(msg = "msg asd-sdf", name = "name")
    sendMessage(msg = "msg asd-sdf")
    sendMessage(name = "name asd-sdf")
}
fun sendMessage(name: String = "", msg: String = sendText()) {
    println("$name, $msg")
}

fun sendText(): String = "text"