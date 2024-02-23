import java.util.ArrayList;
import java.util.List;

import server.OutputConfig;
public class InMemoryOutputConfig implements OutputConfig {
    private final List<String> output = new ArrayList<>();
    public List<String> getOutputMutable() {
		    return output;
	  }
}
