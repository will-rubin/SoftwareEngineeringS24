
public interface ComputeEngine {
    /* What the compute engine needs to be able to do
     * This component will do the actual calculation and will not be the "user"
     */
      String compute(int value);
      Integer number = Integer.parseInt(User.input);
      //do the calculation
      int empty=0;
      String result="";
      System.out.println(28/6);
      for (int a=1; a<number; a++) {
          if (number%a == 0) {
              //System.out.println(theThing);
              //System.out.println(true);
              //empty+=theThing;
              System.out.println("Current value"+a);
              empty+=a;
          }
        
      }
      if (empty==number) {
        result="perfect";
      }
      else if (empty<number) {
        result="deficient";
      }
      else {
        result="abundant";
      }
      //return the result in a specified fashion
      System.out.println(result);
      String compute(String result);
}


/*
    An API between two separate components within the compute engine. One
    component will handle initialization, reading, and writing for the job, and a second
    component will do the actual computation.
    
    a. As a first step, determine which component is the user for this API, and
    make sure your design and prototype reflect that
 */
