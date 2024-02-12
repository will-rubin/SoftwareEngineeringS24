
import src.Client.User.InputConfig;
import src.Client.User.OutputConfig;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
}
