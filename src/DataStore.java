import user.InputConfig;
import user.OutputConfig;

public class DataStore {
    public void processData(InputConfig inputConfig, OutputConfig outputConfig) {
        List<Integer> inputData = (List<Integer>) inputConfig.getIterator().next();
      //Read the list of integers
        for (Integer inputValue : inputData) {
            String processedResult = processItem(inputValue); 
          //Read the string 
            outputConfig.write(processedResult);
        }
    }
    private String processItem(Integer inputValue) {
        return "Processed: " + inputValue;
    }
}
