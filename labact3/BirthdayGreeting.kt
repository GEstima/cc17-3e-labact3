fun main() {
val age = 22*365
val name = "Gianne"
val border = "%==%==%"
val timesToRepeat = 3
printBorder(border, timesToRepeat)
print("Happy Birthday! ${name} \n")
printBorder(border, timesToRepeat)
print("I am ${age} days old! \n")
print("${age} days old is the best age to learn Kotlin! \n")

//No comment
println(" ,,,,, ")
println(" ||||| ")
println(" =========")
println("@@@@@@@@@@@")
println("{~@~@~@~@~}")
println("@@@@@@@@@@@")
println("")
print("${name} is already ${age} days old! \n")
}

fun printBorder(border: String, timesToRepeat: Int) {
repeat(timesToRepeat) {
print(border)
}
println()
}
