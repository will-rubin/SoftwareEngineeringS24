import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import server.InputConfig;
import server.OutputConfig;
import server.StorageSystemImplementation;
import server.WriteResult.WriteResultStatus;

public class StorageSystemTest {
    @Test
	public void smokeTestRead() {

		InputConfig inputConfig = Mockito.mock(InputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		Assert.assertEquals(1L, dataStore.read(inputConfig));
	}
	
	@Test
	public void smokeTestWrite() {
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		
		Assert.assertEquals(WriteResultStatus.SUCCESS, 
		dataStore.addResult(outputConfig, "result").getStatus());
	}
}
