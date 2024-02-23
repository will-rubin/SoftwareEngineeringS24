import server.InputConfig;
import server.OutputConfig;
import server.StorageSystem;
import server.WriteResult;
import server.OutputConfig.InMemoryOutputConfig;

public class TestStorageSystem implements StorageSystem {
    @Override
	public Iterable<Integer> read(InputConfig input) {
		return ((InMemoryInputConfig)input).getInputs();
	}

	@Override
	public WriteResult addResult(OutputConfig output, String result) {
		((InMemoryOutputConfig)output).getOutputMutable().add(result);
		return () -> WriteResult.WriteResultStatus.SUCCESS;
	}
    
  }