import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var result = ""
    println("Введите длину массива")
    val lengthArray = scan.nextInt()       // Считываем длину массива
    val arr = Array<Int>(lengthArray) { 0 }  // Создаём массив

    println("Введите $lengthArray целых чисел в массив")
    for (i in 0 until lengthArray) {    // Запускаем цикл от 0 до (lengthArray-1)
        arr[i] = scan.nextInt()     // Считываем числа в массив

        if (arr[i] % 3 == 0) {      // Проверяем элемент на кратность 3
            result += arr[i]     // Если элемент кратен 3 то записываем его в переменную result
            result += " "       // Добавляем пробел между элеметами для красоты вывода
        }
    }
    if (result == "")  // Проверяем есть ли в результате хоть один найденный элемент кратный 3
        println("Нет элементов массива кратных 3")      //Если найденныъ элементов нет выводим соответсвующее сообщение
    else
        println("Элементы массива кратные 3: $result")      //Если элементы есть то выводим сообщение со списком элементов кратных 3
}

