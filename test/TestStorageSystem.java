import Server.WriteResult;
import User.InputConfig;
import User.OutputConfig;
import User.OutputConfig.InMemoryOutputConfig;

public class TestStorageSystem implements StorageSystem {
    @Override
	public Iterable<Integer> read(InputConfig input) {
		return ((InMemoryInputConfig)input).getInputs();
	}

	@Override
	public WriteResult appendSingleResult(OutputConfig output, String result) {
		((InMemoryOutputConfig)output).getOutputMutable().add(result);
		return () -> WriteResult.WriteResultStatus.SUCCESS;
	}
    
  }