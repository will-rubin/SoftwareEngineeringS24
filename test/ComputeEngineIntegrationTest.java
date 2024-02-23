import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import User.OutputConfig.InMemoryOutputConfig;

public class ComputeEngineIntegrationTest{
  @Test
	public void testComputeWorkflow() {
		
		ComputeEngine engine = new ComputeEngineImplementation();
		
		TestDataStore testDs = new TestDataStore();
		
		ComputationCoordinator coord = new CoordinatorImpl(testDs, engine);
		
		InMemoryInputConfig input = new InMemoryInputConfig(1, 10, 25);
		
		InMemoryOutputConfig output = new InMemoryOutputConfig();
		
		
		ComputeRequest mockRequest = Mockito.mock(ComputeRequest.class);
		when(mockRequest.getInputConfig()).thenReturn(input);
		when(mockRequest.getOutputConfig()).thenReturn(output);
		
		ComputeResult result = coord.compute(mockRequest);
		
		Assert.assertEquals(ComputeResult.SUCCESS, result);
		
		List<String> expected = new ArrayList<>();
		expected.add("1");
		expected.add("10");
		expected.add("25");
		
		Assert.assertEquals(expected, output.getOutputMutable());
	}
}
