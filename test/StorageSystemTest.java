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
<<<<<<< HEAD

=======
		
>>>>>>> 15530281fd77d53f4d564e3bfe520854f3d8d2a7
		InputConfig inputConfig = Mockito.mock(InputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		Assert.assertEquals(1L, dataStore.read(inputConfig));
	}
	
	@Test
	public void smokeTestWrite() {
<<<<<<< HEAD
=======
		
>>>>>>> 15530281fd77d53f4d564e3bfe520854f3d8d2a7
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		
<<<<<<< HEAD
		Assert.assertEquals(WriteResultStatus.SUCCESS, 
		dataStore.addResult(outputConfig, "result").getStatus());
=======
		Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.addResult(outputConfig, "result").getStatus());
>>>>>>> 15530281fd77d53f4d564e3bfe520854f3d8d2a7
	}
}
