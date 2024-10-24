import org.junit.jupiter.api.*;

import static ru.otus.java.basic.App.reverseArray;

public class AppTest {
    @Test
    void testReverseArray(){
        int[] array = {1,2,3};
        Assertions.assertArrayEquals(array, reverseArray(array));
    }
}

