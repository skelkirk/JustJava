/* Написать метод, которому на вход подается одномерный
*  массив и число n (может быть положительным, или
* отрицательным), при этом метод должен сместить все элементы массива
*  на n позиций. Для усложнения задачи нельзя пользоваться
  вспомогательными массивами.
*/

package Lesson2;

import java.util.Arrays;

public class Task72 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int shift=1;

       // shifting(arr, shift);
        shifting2(arr, shift);
    }
    // сдвиг элементов массива вправо
    /*static void shifting(int[] array, int n){

        int temp=0;

        for (int k = 0; k < n ; k++) {
            temp = array[array.length- 1];
            for (int i = array.length - 1; i > 0; i--) {
                    array[i] = array[i - 1];
                }
                array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }*/
    // сдвиг элементов массива влево
    static void shifting2(int[] array, int n) {
        int temp = 0;
        for (int k = 0; k < n; k++) {
            temp = array[0];
            for (int i = 0; i < array.length-1; i++) {
                array[i]=array[i+1];
            }
            array[array.length - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

