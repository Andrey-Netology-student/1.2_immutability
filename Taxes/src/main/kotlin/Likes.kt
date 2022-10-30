//Задача №2. Люди/Человеки
fun main(args: Array<String>) {
    print("Введите количество лайков: ")
    var likes = readLine() //Принимает строку
    var lastSign = "1"
        if (likes != null) {
        if (likes.length > 1) { //Если длина строки == 1 - отнимать ничего не нужно!
            lastSign = likes?.takeLast(likes.length - 1).toString() //Определяет длину строки и берёт последнюю цифру
        } else {
            lastSign = likes //Для случаев, когда длина likes == 1, например, 2 человека
        }
    }
    var digit = Integer.parseInt(lastSign) //String to int
    println(digit)

    var quantity = likes?.toInt() //Нужно преобразовать строку в число для сравнения с числом!
    if (digit == 1 && quantity != 11) { //Правильно ведь 11 людям, а не человекам?
        println("Понравилось $likes человеку")//Если послед. цифра == 1 - человеку
    } else {
        println("Понравилось $likes людям")//Иначе - людям
    }
}
