abstract class Environment(vararg ags : Actor) {          //built-in functions to create collections of a certain type
                                                         // Placed in an Array<T> takes any number of parameters
        val agents : List<Actor> = ags.toList()

       open fun step() {
            for (agent in agents) {  //Provided by environment agent in list of type Actor, sense determine the action of agent
                sense(agent)        // Process action of agent
                processAction(agent, agent.act())
            }
        }

        abstract fun processAction(agent : Actor, act : Action)

        abstract fun sense(agent : Actor)
    }

