// Понял закономерность 11 111 1111 и т.д, Людям но не могу реализивать кратко.

fun main() {

    print("Количество лайков: ")
    val likes: UInt = readln().toUInt()
    val solution: String

    if (likes > 1u || likes < 99u) {
        solution = if (likes / 10u == 1u && likes % 10u == 1u) "Людям" else "Человеку"
        println()
        println("Понравилось $likes $solution")

    } else if (likes > 99u || likes < 999u) {
        solution = if ((likes / 100u == 1u) && ((likes / 10u) % 10u == 1u) && (likes % 10u == 1u))
            "Людям" else "Человеку"
        println()
        println("Понравилось $likes $solution")

    } else {
        print("Число за пределами моего понимания. Начните сначала и повторите ввод от 1 до 999")
    }


}

