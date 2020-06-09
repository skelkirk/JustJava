/*
Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое), и с помощью цикла(-ов)
заполнить его диагональные элементы единицами;
*/

package Lesson2;

public class Task4 {
    public static void main(String[] args) {
        final int SIZE=5;
        int[][] arr=new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(i==j) {
                    arr[i][j]=1; }
                else {
                    arr[i][j]=0; }

                arr[i][SIZE-1-i]=1;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
