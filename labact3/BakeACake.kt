fun main() {
    val age = 24
    val layers = 5
	CandlesCake(age)
    CakeTop(age)
    CakeBottom(age,layers)
}

fun CandlesCake(age: Int){
    
	repeat(age){
        print("'")   
	}
    println()
    repeat(age){
        print("|")   
	}
    println()
}

fun CakeTop(age:Int) {
    repeat(age){
        print("=")   
	}
    println()
}

fun CakeBottom(age:Int,layers:Int) {
    repeat(layers){
        repeat(age){
        print("@")   
		}
        println()
	}
}
