fun main() {


    val person = Person("John", "Doe")

    person.printInfo()
    person.isAlive()

    val newCar = Car()
    newCar.canInfo("Toyota", "CHR hybrid 2015", "Rahim Miya")

    val list = listOf("abc", "xyz", "mno");

    val newCountSize = CountSize()
    newCountSize.countListSize(list)


    val name = "Syed Bipul Rahman"
    newCountSize.countChar(name)

}
