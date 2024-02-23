import User.InputConfig;
import User.OutputConfig;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
}
