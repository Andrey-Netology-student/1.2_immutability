//Задача №1. Денежные переводы
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    print("Введите сумму перевода: ")

    val amount = Integer.valueOf(readLine()) //Хранит сумму перевода.
    var tax = amount * 0.0075
    if (tax < 35) {
        tax = 35.0
    }
    tax = (tax * 100).roundToInt() / 100.0 //Для округления до сотых
    println("Комиссия за перевод: $tax рублей")
}