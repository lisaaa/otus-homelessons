package otus.project.lessons32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArrayTransformateTest {

    private ArrayTransformate arrayTransformate;

    @BeforeEach
    void setUp() {
        arrayTransformate = new ArrayTransformate();
    }

    @Test
    void testArrayWithout2() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            arrayTransformate.returnArray2(new int[]{2, 2, 2, 2, 2});
        }, "В массиве не найдена 1");
    }

    @Test
    void testArrayWith2FirstPosition() {
        ArrayList<Integer> result = arrayTransformate.returnArray2(new int[]{1, 2, 2, 2, 2});

        ArrayList<Integer> expected =  new ArrayList<>(List.of(2,2,2,2));

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testArrayWith2LastPosition() {
        ArrayList<Integer> result = arrayTransformate.returnArray2(new int[]{1, 2, 2, 2, 1});

        ArrayList<Integer> expected =  new ArrayList<>();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testeArrayWith1() {
        boolean result = arrayTransformate.hasArrayNumbers1Or2(new int[]{1, 1, 1, 1, 1});

        Assertions.assertEquals(true, result);
    }

    @Test
    void testArrayWith2() {
        boolean result = arrayTransformate.hasArrayNumbers1Or2(new int[]{2, 2, 2, 2, 2});

        Assertions.assertEquals(true, result);
    }

    @Test
    void testArrayWithOtherNumbers() {
        boolean result = arrayTransformate.hasArrayNumbers1Or2(new int[]{2, 5, 2, 2, 2});

        Assertions.assertEquals(false, result);
    }

}