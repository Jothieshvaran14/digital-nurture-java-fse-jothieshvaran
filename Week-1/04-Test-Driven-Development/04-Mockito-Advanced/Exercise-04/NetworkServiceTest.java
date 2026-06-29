import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    public static void main(String[] args) {

        Runnable network = mock(Runnable.class);

        network.run();

        verify(network).run();

    }

}