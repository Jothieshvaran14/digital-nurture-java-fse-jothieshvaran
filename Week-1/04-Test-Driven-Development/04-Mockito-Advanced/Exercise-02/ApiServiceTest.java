import static org.mockito.Mockito.*;

public class ApiServiceTest {

    public static void main(String[] args) {

        Runnable api = mock(Runnable.class);

        api.run();

        verify(api).run();

    }

}