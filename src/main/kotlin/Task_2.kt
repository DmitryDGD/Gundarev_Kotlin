import java.util.Scanner

    fun main() {
        val scan = Scanner(System.`in`)
        var name = ""
        name = scan.nextLine()
        if (name == "Вячеслав")
            println("Привет, Вячеслав")
        else
            println("Нет такого имени")
    }
