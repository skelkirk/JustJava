package Task7;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int  numberOfShifts = 2;

        leftShiftedArray(array, numberOfShifts);
        rightShiftedArray(array1, numberOfShifts);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
}

    public static void leftShiftedArray(int [] array, int numberOfShifts) {
        int memorizedNumber = 0;
        int lastIndex = array.length-1;


    for (int i = 0; i < numberOfShifts; i++) {
        memorizedNumber = array[0];

        for (int j = 0; j < array.length -1 ; j++) {
            array[j] = array[j+1];
        }
        array[lastIndex] = memorizedNumber;
    }
    }

    public static void rightShiftedArray(int [] array, int numberOfShifts) {
        int memorizedNumber = 0;
        int lastIndex = array.length-1;


        for (int i = 0; i < numberOfShifts; i++) {
            memorizedNumber = array[lastIndex];

            for (int j = lastIndex; j > 0 ; j--) {
                array[j] = array[j - 1];
            }
            array[0] = memorizedNumber;
        }
    }
}
