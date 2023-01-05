fun main(args: Array<String>) {
    val student1 = Student(90, "ABC", 61)
    val student2 = Student(39, "BDC", 1)

    println("Marks of ${student1.name}: ")
    println("Marks: ${student1.marks}")
    println("Grade: ${student1.grade}")

    println("Marks of ${student2.name}: ")
    println("Marks: ${student2.marks}")
    println("Grade: ${student2.grade}")
}