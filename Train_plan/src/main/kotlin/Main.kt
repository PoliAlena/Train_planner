import kotlin.random.Random

fun main(){
    var run = true
    while (run)
    {
        println("Вы хотите составить поезд (1) или закончить работу (2)?")
        val answer = readln().toIntOrNull()

        when (answer)
        {
            1 -> train()
            2 -> run = false
            else -> println("Ваш ответ некорректен")
        }
    }
}
private fun train()
{
    println("Создать направление")
    val cities = listOf("Москва","Санкт-Петербург","Новосибирск","Екатеринбург","Казань","Нижний Новгород","Челябинск","Самара","Уфа","Ростов-на-Дону","Омск","Красноярск","Воронеж","Пермь","Волгоград","Краснодар","Тюмень","Саратов")
    val сitiesRandom = cities.shuffled().take(2)
    val start = сitiesRandom[0]
    val end = сitiesRandom[1]
    println("Поезд отрправляется из "+start+" в "+end)

        println("Продать билеты")
        val passengers = Random.nextInt(5,201)
        println("Продано билетов: "+passengers)

        println("Сформировать поезд")
        var carriages = 0
        val capacity = Random.nextInt(5,25)
        println("Вместимость одного вагона: "+capacity)
        var p = passengers
        while (p >= 0)
        {
            p -= capacity
            carriages += 1
        }
        println("Кол-во вагонов в поезде: "+carriages)

        println("Ваш поезд, следующий из "+start+" в "+end+" состоящий из "+carriages+" вагонов вместимостью "+capacity+" человек отправлен. Колличество пассажиров составляет: "+passengers)

}