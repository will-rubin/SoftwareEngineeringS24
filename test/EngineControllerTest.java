import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import server.compute.ComputeEngine;
import server.compute.ComputeRequest;
import server.compute.ComputeResult;
import server.compute.EngineController;
import server.compute.EngineControllerImplementation;

public class EngineControllerTest {
    @Test
	public void smokeTest() {
		// mock out the dependencies so that we're just checking the ComputationCoordinator
		DataStore dataStore = Mockito.mock(DataStore.class);
		ComputeEngine computeEngine = Mockito.mock(ComputeEngine.class);
		
		EngineController coord = new EngineControllerImplementation();
		
		
		ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
		ComputeResult result = coord.compute(mockRequest);
		
		Assert.assertEquals(result.getStatus(), ComputeResult.ComputeResultStatus.SUCCESS);
	}
}
