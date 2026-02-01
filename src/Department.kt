abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}
class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел написания статей"

    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName: Писать современые статьи")
    }
}
class TestingDepartment : Department() {
    override val departmentName: String = "Отдел проверки грамотности статей"

    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName: Находить все ошибки")
    }
}