package Server.ComputeEngine;

public interface ComputeEngine {
    /* What the compute engine needs to be able to do
     * This component will do the actual calculation and will not be the "user"
     */
    //ComputeEngine must take in a stream of integers
    //accept some int
    UserInput userInput = EngineController.getUserInputStream();
    //do the calculation
    
    FactorsOfInput factors = findFactors(userInput)
    for(factor in factors) {
      CalculateAbundancy(factor, userInput);
    }
    //return the calculation
    sendResultToController(Result);
  }

public void testComputeEngine(Input input) {
  
}

/*
    An API between two separate components within the compute engine. One
    component will handle initialization, reading, and writing for the job, and a second
    component will do the actual computation.
    
    a. As a first step, determine which component is the user for this API, and
    make sure your design and prototype reflect that
 */
