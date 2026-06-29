import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    @Test
    void testException(){

        ExceptionThrower ex = new ExceptionThrower();

        assertThrows(RuntimeException.class,
                ex::throwException);

    }

}