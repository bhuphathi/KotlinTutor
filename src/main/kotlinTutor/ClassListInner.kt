class ClassListInner(var items: Array<String>) {
    inner class ListItem(){
        fun view(position: Int) {
            println(items[position])
        }
    }
}