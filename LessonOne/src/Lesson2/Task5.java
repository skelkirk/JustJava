/*
Задать одномерный массив и найти в нем минимальный и
максимальный элементы (без помощи интернета);
*/

package Lesson2;

public class Task5 {
    public static void main(String[] args) {
        int minValue=0;
        int maxValue=0;
        int[] arr={1,223,5,-6,3,7,23,72,332,12};
        minValue=maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            } else if(arr[i]<minValue){
                minValue=arr[i];
            }
        }


        System.out.println("Макс. значение - "+maxValue+"\n"+
                "Мин. значение - " + minValue);
        }
    }

