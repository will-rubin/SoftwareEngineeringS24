package Server;
import java.util.Collections;

import Client.UserClient.InputConfig;
import Client.UserClient.OutputConfig;
import Server.WriteResult.WriteResultStatus;



public class StorageSystemImplementation implements StorageSystem {

    public Iterable<Integer> read(InputConfig input) {
        return Collections.emptyList();
    }

    public WriteResult addResult(OutputConfig output, String result) {
        return () -> WriteResultStatus.FAILURE;
    }
}
