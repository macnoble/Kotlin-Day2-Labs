// An agent is an actor in the environment.
// The agent perceives its environment and then takes an action


interface Actor {
    val name : String
    fun act() : Action                            // where the agent selects an Action to take, and returns it to be processed by the environment.
    fun perceive(vararg facts : Percept):Unit    //  where the agent is given and has to process "facts" that it "senses" in its environment.
}