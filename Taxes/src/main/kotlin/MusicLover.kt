//Задача №3. Меломан

fun main(args: Array<String>) {
    val itemPrice = 100
    var regularBuyer: Boolean = false
    var minDiscount = 100 //Использовать для расчёта скидки и вывода в when
    val discountStart = 1_001
    val discountMax = 10_001
    while (true) { //Цикл while добавлен для постоянного покупателя.
        print("Введите количество дисков или 0 для выхода: ")

        var itemCount = Integer.valueOf(readLine()) //Принимает целочисленный тип данных
        var totalPrice = itemPrice * itemCount

        if (itemCount == 0) { //После ввода 0 - выход из цикла
            break
        }

        if (totalPrice in discountStart until discountMax) { //Скидка 100 рублей, если цена выше 1_001
            println("Покупка - $totalPrice рублей ->")
            totalPrice -= minDiscount
            println("После применения скидки $minDiscount рублей = $totalPrice рублей.")
            if (regularBuyer) {
                minDiscount = (totalPrice / 100) * 1
                totalPrice -= minDiscount
                println("После применения 1% скидки - $totalPrice рублей.") //Для постоянных покупателей
            }
        } else if (totalPrice >= discountMax) { //Скидка 5%, если цена выше 10_001
            println("Покупка - $totalPrice рублей ->")
            totalPrice -= (totalPrice / 100) * 5
            println("После применения 5% скидки - $totalPrice рублей.")
            if (regularBuyer) {
                totalPrice -= (totalPrice / 100) * 1
                println("После применения 1% скидки - $totalPrice рублей.") //Для постоянных покупателей
            }
        } else {
            println("Покупка - $totalPrice рублей ->")
            println("Скидка не предоставляется")
        }

        if (itemCount != 0) {
            regularBuyer = true
        }
    }
}