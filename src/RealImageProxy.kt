class RealImageProxy(var fileName: String) : Image {
    private var realImage:RealImage?=null



    override fun display() {
        if (realImage==null){
            realImage=RealImage(fileName)
        }
        realImage!!.display()
    }
}