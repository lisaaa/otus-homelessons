package otus.project.lessons32;


public class Main {


    public static void main(String[] args) throws RuntimeException {
        int[]arr1 = {1, 2, 2, 3, 1};
        int[]arr2 = {2, 2, 2, 2, 2};
        int[]arr3 = {1, 2, 2, 2, 2};
        int[]arr4 = {2, 2, 1, 2, 2};
        int[]arr5 = {1, 1, 1, 1, 1};
        int[]arr6 = {6, 6, 6, 6, 6};

       // System.out.println(new ArrayTransformate().returnArray2(arr2));
        System.out.println(new ArrayTransformate().hasArrayNumbers1Or2(arr6));
    }


}
