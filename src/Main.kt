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



    val task1 = Task(
        title = "Взять интервью у Олеси Иванченко",
        description = "Написать статью об интервью",
        priority = Priority.HIGH
    )
    val task2 = Task(
        title = "Взять интервью у Олеси Иванченко",
        description = "Написать статью об интервью",
        priority = Priority.HIGH
    )
    val task3 = Task(
        title = "Сдать работу",
        description = "Ждать...",
        priority = Priority.MEDIUM
    )
    println("\n1. toString():")
    println("task1: $task1")
    println("task3: $task3")
    println("\n2. equals():")
    println("task1 == task2: ${task1 == task2}")
    println("task1 == task3: ${task1 == task3}")
    println("\n3. hashCode():")
    println("task1: ${task1.hashCode()}")
    println("task2: ${task2.hashCode()}")
    println("task3: ${task3.hashCode()}")
    println("\n4. copy():")
    val task1Copy = task1.copy(priority = Priority.LOW)
    println("Копия task1 с LOW: $task1Copy")



    val devDept = DevelopmentDepartment()
    val testDept = TestingDepartment()
    println("\nОтдел 1: ${devDept.departmentName}")
    devDept.printDepartmentGoal()
    println("\nОтдел 2: ${testDept.departmentName}")
    testDept.printDepartmentGoal()
}


