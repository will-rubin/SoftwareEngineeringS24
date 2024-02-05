package Server.ComputeEngine;

public class ComputeEngine {
    /* What the compute engine needs to be able to do
     * This component will do the actual calculation and will not be the "user"
     */
    //accept some string
    //parse string into operands and parameters
    //do the calculation
    //return the result in a specified fashion
    String userInput = User.input();
    while (Integer.parseInt(userInput)<0 || Integer.parseInt(userInput)>Integer.MAX_VALUE)
    {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter an input number");
      userInput = myObj.nextLine(); 
    }
      //parse string into operands and parameters
      Integer number = Integer.parseInt(userInput);
      //do the calculation
      int empty=0;
      String result="";
      System.out.println(28/6);
      for (int a=1; a<number; a++)
      {
          if (number%a == 0)
          {
              //System.out.println(theThing);
              //System.out.println(true);
              //empty+=theThing;
              System.out.println("Current value"+a);
              empty+=a;
          }
        
      }
      if (empty==number)
      {
        result="perfect";
      }
      else if (empty<number)
      {
        result="deficient";
      }
      else
      {
        result="abundant";
      }
      //return the result in a specified fashion
      System.out.println(result);
  }

/*
    An API between two separate components within the compute engine. One
    component will handle initialization, reading, and writing for the job, and a second
    component will do the actual computation.
    
    a. As a first step, determine which component is the user for this API, and
    make sure your design and prototype reflect that
 */
