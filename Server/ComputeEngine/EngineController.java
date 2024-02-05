package Server.ComputeEngine;

public interface EngineController {
    /* This component will handle initialization, reading and writing for a job
     * 
     */
    //initialiize user choices
    UserInput userInput = User.getInput();
    UserOutput userOutput = User.getOutput();
    UserDelimiter userDelimiter = User.getDelimiter();
    //call storage system if necessary to get input
        //send source details to storage system
        //receive response of input values
    //create operable list to be sent to compute engine

    //send data to compute engine
    //receive data from compute engine
    
    //parse results into sendable format

    //send computed data to storage system of use choice
}
