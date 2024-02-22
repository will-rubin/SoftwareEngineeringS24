import org.mockito.Mockito;

import Server.ComputeEngine;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class TestComputeEngine {
  public void testCompute() {
    String result = ComputeEngine.compute(8675309);
    assert result.isString();
  }
}
