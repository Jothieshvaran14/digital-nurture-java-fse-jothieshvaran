import static org.mockito.Mockito.*;

import java.util.List;

public class MyServiceTest {

    public static void main(String[] args) {

        List<String> list = mock(List.class);

        when(list.get(0))
                .thenThrow(new RuntimeException());

        try {

            list.get(0);

        } catch (Exception e) {

            System.out.println("Exception Caught");

        }

    }

}