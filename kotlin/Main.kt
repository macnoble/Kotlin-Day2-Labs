fun main() {
//    val env = FoodEnvironment(SimpleAgent("Charlie"))
//    env.step()
//    env.step()
//    println(env.scores)

    val env = FoodEnvironment()
    for (i in 1..10) {
        env.step()
        println(env.animal)
    }
}

