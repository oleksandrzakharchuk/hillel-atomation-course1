package calc;

public class Calc {

    public int getSum(int x, int y) {
        return x+y;
    }

    public int getDivide(int x, int y) {
           if (y==0){ throw new RuntimeException();
        }return x/y;
    }

    public int getMultiple(int x, int y) {
        return x*y;
    }

}
