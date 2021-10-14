import kotlin.random.Random


class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
     val scores : MutableMap<Actor,Int> = mutableMapOf<Actor,Int>()
    var animal: String? = null

    init {
        for (actor in ags){
            scores[actor] = 0
        }
    }


    override fun processAction(agent: Actor, act: Action) {
        when(act){

            is ForageAction -> scores[agent] = scores[agent]?.plus(1)?:1
            is HuntAction -> scores[agent] = scores[agent]?.plus(1)?: 1
            is NoAction -> return

        }
    }

    override fun sense(agent: Actor) {
        if (animal.equals(null)){
        agent.perceive()}
        else
            animal?.let { Percept("animal", it) }
    }

    override fun step() {
        var randomValue = Random.nextDouble(0.0,1.0)

        animal = if (randomValue > 0.5) {
            "Antelope"
        }
        else {
            null
        }
        super.step()
    }
}

/** 5. (Optional) Create another subclass of Action called NoAction - that represents the agent doing nothing. Create a new type of agent called RandomAgent that takes a Double parameter that is the probability of it performing the ForageAction in a given timestep. Implement its act() method - you'll need to look up Kotlin's random number generation API.
Once you have completed this, try running the following main method:

fun main() {
val env = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
for (i in 1..100)
env.step()
println(env.scores)
} */