data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean = false
)
enum class Priority {
    LOW, MEDIUM, HIGH
}