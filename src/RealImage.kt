class RealImage(val fileName: String) : Image {
    init {
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying $fileName ")
    }

    fun loadFromDisk(fileName: String){
        println("$fileName Loading... ")
    }
}