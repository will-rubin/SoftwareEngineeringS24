package Server;
import Client.UserClient.InputConfig;
import Client.UserClient.OutputConfig;

public interface ComputeRequest {
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimiter();
}
