import server.InputConfig;
import server.OutputConfig;
import server.StorageSystem;
import server.WriteResult;
<<<<<<< HEAD
=======

>>>>>>> 15530281fd77d53f4d564e3bfe520854f3d8d2a7
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