package server;

import java.util.Collections;

import server.WriteResult.WriteResultStatus;

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
