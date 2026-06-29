import static org.mockito.Mockito.*;

import java.util.List;

public class MyServiceTest {

    public static void main(String[] args) {

        List<String> list = mock(List.class);

        doNothing().when(list).clear();

        list.clear();

        verify(list).clear();

    }

}