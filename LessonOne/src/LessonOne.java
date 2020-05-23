

public class LessonOne {

    public static void main(String[] args) {
        int b1 = 1;
        float b2 = 2f;
        double b3 = 3;
        long b4 = 4L;
        char b5 = 'b';
        boolean b6 = true;
        short b7 = 6;
        byte b8 = 5;
        int e = 0;
        String name="Vasya";
        pr(name);
        pos(e);
        System.out.println(vis(2004));
        System.out.println(neg1(-1));
        System.out.println(calc(1, 2, 4, 2));
        System.out.println(tr(1, 10));
    }

    public static int calc(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean tr(int a, int b) {
        if (a + b >= 10 & a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void pos(int a) {
        if (a >= 0) {
            System.out.println("Введенное число - положительное");
        } else {
            System.out.println("Введенное число - отрицательное");
        }
    }

    public static boolean neg1(int a) {
        boolean b;
        if (a < 0) {
            b = true;
        } else {
            b=false;
        }
        return b;
    }
    public static void pr(String name){
        System.out.println("Привет, "+name+"!");
    }
    public static String vis(int a){
        if(a%4==0 & a%100!=0 | a%400==0){
            return "Это високосный год";
        } else {
            return "Это невисокосный год";
        }
    }
}

