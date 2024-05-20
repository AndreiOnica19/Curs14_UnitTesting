package main;

public class Mathematics {

    public static int add(int x, int y) {
        return x + y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int findMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }


}
