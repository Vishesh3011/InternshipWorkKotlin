fun predictGrade(marks: Int) = when(marks){
    in 0..40 -> "F"
    in 40..49 -> "E"
    in 50..59 -> "D"
    in 60..69 -> "C"
    in 70..79 -> "B"
    in 80..89 -> "A"
    in 90..100 -> "A+"
    else -> "invalid"
}

class Student (
    var marks: Int = 0,
    var name: String? = null,
    var rollNo: Int? = null
){
    val grade = predictGrade(marks)
}