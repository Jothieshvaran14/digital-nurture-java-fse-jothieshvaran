import static org.mockito.Mockito.*;

import java.util.List;

public class MyServiceTest {

    public static void main(String[] args) {

        List<String> list = mock(List.class);

        when(list.get(anyInt())).thenReturn("Mockito");

        System.out.println(list.get(10));

    }

}