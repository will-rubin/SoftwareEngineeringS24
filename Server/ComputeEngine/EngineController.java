package Server.ComputeEngine;

public class EngineController {
    /* This component will handle initialization, reading and writing for a job
     * 
     */
    //initialiize user choices
    UserInput userInput = User.getInput();
    UserOutput userOutput = User.getOutput();
    UserDelimiter userDelimiter = User.getDelimiter();
    //call storage system if necessary to get input
        //send source details to storage system
    //create operable list to be sent to compute engine
    //send data to compute engine
    //receive data from compute engine
    //send computed data to storage system of use choice
}
