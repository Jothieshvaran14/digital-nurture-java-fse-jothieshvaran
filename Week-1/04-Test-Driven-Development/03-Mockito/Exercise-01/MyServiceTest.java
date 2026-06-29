import static org.mockito.Mockito.*;

public class MyServiceTest {

    public static void main(String[] args) {

        Runnable mock = mock(Runnable.class);

        mock.run();

        verify(mock).run();

    }
}