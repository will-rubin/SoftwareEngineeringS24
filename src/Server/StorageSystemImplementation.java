package server;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import server.WriteResult.WriteResultStatus;

public class StorageSystemImplementation implements StorageSystem {
	
    @Override
	public Iterable<Integer> read(InputConfig input) {
		return Collections.emptyList(); 
	}

	@Override
	public WriteResultStatus addResult(OutputConfig output, String result) {
		try {
			FileWriter fw = new FileWriter(output.getFilename());
			fw.write(result);
			return WriteResult.WriteResultStatus.SUCCESS;
		} catch (IOException e) {
			System.out.println("An error occurred.");
      		e.printStackTrace();
		}
		return WriteResult.WriteResultStatus.FAILURE;
		
	}
}
