package Server.ComputeEngine;

public class ComputeEngine {
    /* What the compute engine needs to be able to do
     * This component will do the actual calculation and will not be the "user"
     */
    //accept some string
    String userInput = User.input();
    //parse string into operands and parameters
    //do the calculation
    //return the result in a specified fashion
}

/*
    An API between two separate components within the compute engine. One
    component will handle initialization, reading, and writing for the job, and a second
    component will do the actual computation.
    
    a. As a first step, determine which component is the user for this API, and
    make sure your design and prototype reflect that
 */
