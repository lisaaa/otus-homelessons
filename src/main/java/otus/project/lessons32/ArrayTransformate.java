package otus.project.lessons32;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ArrayTransformate {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public ArrayList<Integer> returnArray2(int[] array) throws RuntimeException {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        int a = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                a = i;
            }
        }
        try {
            if (a != -1) {
                for (int j = a; j < array.length; j++) {
                    if (array[j] != 1) {
                        arrayInt.add(array[j]);
                    }
                }
                return arrayInt;
            } else {
                LOGGER.error("Ошибка! {}", "В массиве не найдена 1");
                throw new RuntimeException("В массиве не найдена 1");
            }
        } finally {

        }
    }
    public boolean hasArrayNumbers1Or2(int[] array) {
        boolean isCheckOneOrTwo = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 2){
                isCheckOneOrTwo = false;
                break;
            } else isCheckOneOrTwo = true;
        }
        return isCheckOneOrTwo;
    }
}
