package otus.project.lessons32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
        int[] result = arrayTransformate.returnArray2(new int[]{1, 2, 2, 2, 2});

        int[] expected = new int[]{2,2,2,2};

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testArrayWith2LastPosition() {
        int[] result = arrayTransformate.returnArray2(new int[]{1, 2, 2, 2, 1});

        int[] expected = new int[0];

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testeArrayWith1() {
        boolean result = arrayTransformate.hasArrayNumbers1or2(new int[]{1, 1, 1, 1, 1});

        Assertions.assertFalse(result);
    }

    @Test
    void testArrayWith2() {
        boolean result = arrayTransformate.hasArrayNumbers1or2(new int[]{2, 2, 2, 2, 2});

        Assertions.assertFalse(result);
    }

    @Test
    void testArrayWithOtherNumbers() {
        boolean result = arrayTransformate.hasArrayNumbers1or2(new int[]{1, 5, 2, 2, 2});

        Assertions.assertFalse(result);
    }

    @Test
    void testArrayWith1And2() {
        boolean result = arrayTransformate.hasArrayNumbers1or2(new int[]{1, 1, 2, 2, 2});

        Assertions.assertFalse(result);
    }

}