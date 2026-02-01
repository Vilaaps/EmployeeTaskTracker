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
    val fullName: String
        get() = _fullName
    val position: String
        get() = _position
    var salary: Int
        get() = _salary
        set(value) {
            if (value < 0) {
                println("Зп не может быть отрицательной")
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
                    println("Опыт не может быть отрицательным")
                    _yearsOfExperience = 0
                }
                else -> _yearsOfExperience = value
            }
        }
    override fun generateReport(): String {
        return listOf(
            "Инфа о сотруднике",
            "ФИО: $fullName",
            "Должность: $position",
            "Зп: $salary",
            "Опыт работы: $yearsOfExperience лет"
        ).joinToString("\n")
    }
}