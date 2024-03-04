import server.InputConfig;
import server.OutputConfig;
import server.StorageSystem;
import server.WriteResult;
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