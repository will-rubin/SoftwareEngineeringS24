import mockito.Mockito;
import mockito.Mockito.when;
import mockito.Mockito.any;

public class TestStorageSystem
  {
    public void testAddResult() throws Exception 
    {
      int result = new StorageSystem.addResult(2,3);
      assert result == 5;
    }
    public void testRead()
    {
      integer read = new StorageSystem.read(1234567890);
      assert read.isInteger();
    }
    
  }
