fun main() {

    print("Количество лайков: ")
    val likes: UInt = readln().toUInt()

    val solution: String = if (likes % 100u == 11u) {
        "Людям"
    } else if (likes % 10u == 1u) {
        "Человеку"
    } else "Людям"

    print("Понравилось $likes $solution")
}




