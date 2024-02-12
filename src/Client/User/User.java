package src.Client.User;

public interface User {
    /* What the user needs to be able to do
     * 
     */
    //either upload a file or choose a web source (url?)
    //choose your delimiter character for the output (with some reasonable defaults)
    //choose a destination for the output
    //send choices to EngineController
    
}



/*
    An API between the user and the compute engine.

    The user will specify a source for the input, delimiter characters for the output, and a destination for the
    output.

    a. Make sure to make the source/destination general - the source could be a
    local file, or it could be on a networked drive. The only guarantee you have
    is that the data storage system will know how to access it
    
    b. Allow the user to opt to use some reasonable default delimiters if they
    don't wish to specify their own
 */
