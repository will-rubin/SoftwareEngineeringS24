import mockito.Mockito;
import mockito.Mockito.when;
import mockito.Mockito.any;

public class TestClientUser
  {
    public void testUser() throws Exception
    {
      User mockUser = Mockito.mock(User.class);
      when (mockUser.isEmpty())
        {
          .thenThrow(new RunTimeException("User Error"));
        }
    }
  }
