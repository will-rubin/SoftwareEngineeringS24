import server.InputConfig;
import server.OutputConfig;
import server.StorageSystem;
import server.WriteResult;
<<<<<<< HEAD
=======
import server.OutputConfig.InMemoryOutputConfig;
>>>>>>> a88d7c0 (added way more tests)

public class TestStorageSystem implements StorageSystem {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Iterable<Integer> read(InputConfig input) {
		return ((InMemoryInputConfig)input).getInputs();
	}

	@Override
	public WriteResult addResult(OutputConfig output, String result) {
		((InMemoryOutputConfig)output).getOutputMutable().add(result);
		return () -> WriteResult.WriteResultStatus.SUCCESS;
	}
    
  }