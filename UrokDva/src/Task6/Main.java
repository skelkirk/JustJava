package Task6;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 2, 1};
        int[] array1 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(checkBalance(array));
        System.out.println(checkBalance(array1));
    }

        public static boolean checkBalance (int [] array) {

            int endIndex = array.length - 1;
            int leftSum = array[0], rightSum = array[endIndex];
            for (int i = 0; i < array.length; i++, endIndex--) {
                if (i + 1 == endIndex - 1) {
                    leftSum += array[i + 1];
                    break; }
                else if (i + 1 == endIndex) {
                    break;
                }
                leftSum += array[i + 1];
                rightSum += array[endIndex - 1];
            }
            if (leftSum == rightSum)
            { return true;
            } else { return false; }
        }

    }

