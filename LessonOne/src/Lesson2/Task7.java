/* Написать метод, которому на вход подается одномерный
*  массив и число n (может быть положительным, или
* отрицательным), при этом метод должен сместить все элементы массива
*  на n позиций. Для усложнения задачи нельзя пользоваться
  вспомогательными массивами.
*/

package Lesson2;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int n=8;

        shifting(arr,n);
    }
    static void shifting(int[] array, int n){

        int shift=1;
        int temp=0;




            System.out.println(Arrays.toString(array));
    }

}

