abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}
class DevelopmentDepartment : Department(), ReportGenerator {
    override val departmentName: String = "Отдел написания статей"

    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName: Писать современые статьи")
    }

    override fun generateReport(): String {
        return listOf(
            "Инфа об отделе",
            "Название: $departmentName",
            "Цель: Писать современые статьи"
        ).joinToString("\n")
    }
}

    class TestingDepartment : Department() {
        override val departmentName: String = "Отдел проверки грамотности статей"

        override fun printDepartmentGoal() {
            println("Цель отдела $departmentName: Находить все ошибки")
        }
    }

