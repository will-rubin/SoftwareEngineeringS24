package server.compute;


public interface EngineController {
    /* This component will handle initialization, reading and writing for a job
     * This is a network API between the user and the compute engine
     * I like the idea of just having a single request wrapper
     *  as Prof. Brainard does, that way the user
     * can input all of their choices
     * 
     * The EngineController will send a ComputeRequest and get
     *  a ComputeRwsult in return
     */

    ComputeResult compute(ComputeRequest request);

    //get user choices and then send it to the 
    //call storage system if necessary to get input
        //send source details to storage system
        //receive response of input values
    //create operable list to be sent to compute engine

    //send data to compute engine
    //receive data from compute engine
    
    //parse results into sendable format

    //send computed data to storage system of use choice
}


