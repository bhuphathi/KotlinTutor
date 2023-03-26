var ClassAnonymous = object : ClassUser("AnonymousClass", "AnonymousLastName", 35){
    /**
     * Anonymous class with object class
     */
    init {
        println("Init Anonymous Class")
    }
    override fun live(): String {
        println("anonymous live fun")
        return super.live()
    }
    fun test(){
        println("test method in anonymous")
    }
}