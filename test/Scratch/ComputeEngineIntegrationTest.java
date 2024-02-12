public class ComputeEngineIntegrationTest{
    String result = ComputeEngine.compute(101025);
    InputConfig getInputConfig(result);
    OutputConfig theOutput = getOutputConfig(result);
    return theOutput.equals(result);
  }
