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
        int[] arr={1,2,3,5,6,31,6,7};
        int n=8;
        shifting(arr,n);
    }
    static void shifting(int[] array, int n){
        int temp1=array[n-1];
        int temp2=array[n-2];
        int temp3=array[n-3];
        for (int i = n-1; i >2 ; i--) {
            array[i]=array[i-3];
        }
        array[2]=temp1;
        array[1]=temp2;
        array[0]=temp3;
        System.out.println(Arrays.toString(array));


    }

    }

