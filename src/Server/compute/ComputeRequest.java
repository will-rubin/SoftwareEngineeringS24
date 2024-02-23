package server.compute;
import server.InputConfig;
import server.OutputConfig;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
}
