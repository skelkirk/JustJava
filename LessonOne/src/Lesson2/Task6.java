/*
Написать метод, в который передается не пустой
одномерный целочисленный массив, метод должен вернуть
true, если в массиве есть место, в котором сумма левой
и правой части массива равны. Примеры:
checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
checkBalance([1, 1, 1, || 2, 1]) → true,
граница показана символами ||, эти символы в массив не входят.
*/

package Lesson2;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 2, 1, 1, 2};

        System.out.println(checkBalance(arr));
    }
        public static boolean checkBalance(int[] array){
            int leftSum = 0;
            for(int i = 0; i < array.length; i++){
                leftSum += array[i];
                int rightSum = 0;
                for (int j = 0; j < array.length; j++){
                    rightSum += (j > i)? array[j] : 0;
                }
                if(leftSum == rightSum){
                    return true;
                }
            }
            return false;
        }

    }

