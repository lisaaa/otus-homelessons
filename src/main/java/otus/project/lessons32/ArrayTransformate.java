package otus.project.lessons32;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ArrayTransformate {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public int[] returnArray2(int[] array) throws RuntimeException {
        ArrayList<Integer> listInt = new ArrayList<>();
        int a = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                a = i;
            }
        }
            if (a != -1) {
                for (int j = a; j < array.length; j++) {
                    if (array[j] != 1) {
                        listInt.add(array[j]);
                    }
                }
                int[] arrayInt = listInt.stream().mapToInt(i->i).toArray();
                return arrayInt;
            } else {
                LOGGER.error("Ошибка! {}", "В массиве не найдена 1");
                throw new RuntimeException("В массиве не найдена 1");
            }
        }

    public boolean hasArrayNumbers1or2(int[] array) {
        boolean isCheck = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 ){
                isCheck = false;
                break;
            } else if (array[i] != 2){
                isCheck = false;
                break;
            } else isCheck = true;

        }
        return isCheck;
    }
}
