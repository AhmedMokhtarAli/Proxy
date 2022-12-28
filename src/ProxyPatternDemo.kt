fun main() {
    val image=RealImageProxy("image.jpg")
    //image will be loaded from disk
    image.display()

    //image will not be loaded from disk
    image.display()

}