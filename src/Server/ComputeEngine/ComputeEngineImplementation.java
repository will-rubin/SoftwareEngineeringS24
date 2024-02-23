public class ComputeEngineImplementation implements ComputeEngine {

    @Override
    public String compute(int number) {
    
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
      return result;
    }
    
}
