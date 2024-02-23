package server;

import server.WriteResult.WriteResultStatus;

public interface StorageSystem {

    /*
    A PROCESS-LEVEL API between the data storage system and the compute engine. The data
    storage system is responsible for reading from and writing to user-specified input
    and output sources. Since this is a process boundary API, exceptions will not propagate across
    it, so error values must be handled with the return type <-- from class
    */


    //data store will take in an InputConfig, and process it into a stream of integers
    Iterable<Integer> read(InputConfig input);
    //Again going with Prof. Brainard's take, let just gradually build up an output until
    // a final result is ready to be sent -
    // we can have another Result for actual transmission
    WriteResultStatus addResult(OutputConfig output, String result);



    /* What the storage system needs to be able to do
     */
    //check if user-specified input is readable
    //check if user-specified output source is good,
    //then initialize output source
    //convert data to different readable and writable formats
    //write data to output source, close output source
    //cache data to connect or write to sources more quickly?
}


