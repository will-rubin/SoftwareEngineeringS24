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
		// While there aren't any dependencies for this component, we can mock out the parameters
		InputConfig inputConfig = Mockito.mock(InputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		Assert.assertEquals(1L, dataStore.read(inputConfig));
	}
	
	@Test
	public void smokeTestWrite() {
		// While there aren't any dependencies for this component, we can mock out the parameters
		// This is optional; for simple parameters, if it's easier to use a real one (like String),
		// feel free to do that
		OutputConfig outputConfig = Mockito.mock(OutputConfig.class);
		
		StorageSystemImplementation dataStore = new StorageSystemImplementation();
		
		// assertEquals will use .equals, so this type of call is generally safe for any Object, but for enums you can also use ==
		// Note that if your dummy implementation returns null, this will NPE - that's fine! As long as the test fails,
		// the exact failure doesn't matter
		Assert.assertEquals(WriteResultStatus.SUCCESS, dataStore.addResult(outputConfig, "result").getStatus());
	}
}
