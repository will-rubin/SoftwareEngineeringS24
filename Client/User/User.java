package Client.User;

public interface User {
    /* What the user needs to be able to do
     * 
     */
    //either upload a file or choose a web source (url?)
    //choose your delimiter character for the output (with some reasonable defaults)
    //choose a destination for the output
    //send choices to EngineController
    public void testUserCase()
    public String input ="-1";
    while (Integer.parseInt(input)<0 || Integer.parseInt(input)>Integer.MAX_VALUE)
    {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter an input number");
      input = myObj.nextLine(); 
    }
}
public void testUser() {
  
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
