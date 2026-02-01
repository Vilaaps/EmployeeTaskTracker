fun main() {
    val employee = Employee(
        fullName = "Самойлова О.М",
        position = "Журналист",
        salary = 140000,
        yearsOfExperience = 10
    )
    println("Сотрудник:")
    println("ФИО: ${employee.fullName}")
    println("Должность: ${employee.position}")
    println("Зарплата: ${employee.salary}")
    println("Опыт: ${employee.yearsOfExperience}")
}