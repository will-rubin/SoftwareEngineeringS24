package Server;

import java.util.Collections;

import Server.WriteResult.WriteResultStatus;
import User.InputConfig;
import User.OutputConfig;

public class StorageSystemImplementation implements StorageSystem {
    @Override
	public Iterable<Integer> read(InputConfig input) {
		return Collections.emptyList(); 
	}

	@Override
	public WriteResult addResult(OutputConfig output, String result) {
	
		return () -> WriteResultStatus.FAILURE; 
	}
}
