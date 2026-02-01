class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
) : ReportGenerator {
    private var _fullName: String = fullName
    private var _position: String = position
    private var _salary: Int = salary
    private var _yearsOfExperience: Int = yearsOfExperience

    private var currentTask1: Task? = null

    val fullName: String
        get() = _fullName

    val position: String
        get() = _position

    var salary: Int
        get() = _salary
        set(value) {
            if (value < 0) {
                println("Зп не может быть отриц")
            } else {
                _salary = value
            }
        }
    var yearsOfExperience: Int
        get() = _yearsOfExperience
        set(value) {
            when {
                value > 50 -> {
                    println("Опыт ограничен 50 годами")
                    _yearsOfExperience = 50
                }
                value < 0 -> {
                    println("Опыт не может быть отриц")
                    _yearsOfExperience = 0
                }
                else -> _yearsOfExperience = value
            }
        }
    fun assignTask(newTask: Task) {
        if (currentTask1 != null && !currentTask1!!.isCompleted) {
            println("Сотрудник уже занят задачей '${currentTask1!!.title}'")
        } else {
            currentTask1 = newTask
            println("Задача '${newTask.title}' успешно назначена сотруднику $fullName")
        }
    }
    override fun generateReport(): String {
        val taskInfo = if (currentTask1 != null) {
            "Текущая задача: ${currentTask1!!.title} (выполнена: ${currentTask1!!.isCompleted})"
        } else {
            "Текущая задача: нет"
        }

        return listOf(
            "Инфа о сотруднике",
            "ФИО: $fullName",
            "Должность: $position",
            "Зп: $salary",
            "Опыт работы: $yearsOfExperience лет",
            taskInfo
        ).joinToString("\n")
    }
}