package test_0328;

public class Test3 {
    public static void main(String[] args){
        FullCalculator f1 = new FullCalculator();

        System.out.println(f1.add(1, 2));
        System.out.println(f1.substract(5, 6));
        System.out.println(f1.multiply(2, 2));

    }
}

interface Calculator{
    default public int add(int a, int b){
        return a + b;
    };
    default public int substract(int a, int b){
        return a-b;

    }

    abstract public int multiply(int a, int b);
}

class FullCalculator implements Calculator{
    @Override
    public int multiply(int a, int b){
       return a*b;
    }

}
