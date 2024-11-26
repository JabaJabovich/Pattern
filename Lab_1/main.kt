import main.kotlin.Student

fun main() {
    val student1 = Student(
        "Фролов",
        "Сергей",
        "Александрович",
        "+79034555866",
        "@jabajabovich",
        "jabovich@example.com",
        "https://github.com/JabaJabovich"
    )

    val student2 = Student(
        "Коваль",
        "Наталья",
        "Игоревна"
    )

    println(student1.toString())
    student2.setContacts("86543212451")
    println(student2.toString())

    println("Проверка:")
    println("Студент 1 валидация: ${student1.validate()}")
    println("Студент 2 валидация: ${student2.validate()}")
}