package test_0328;

public class Test1 {
    public static void main(String[] args){
        System.out.println(Color.RED);  // ���ڿ� "RED" ���
        System.out.println(Color.GREEN); // ���ڿ� "GREEN" ���
        System.out.println(MyNumber.LUCKY_NUMBER); // ���� 777 ���
    }
}
interface Color{
    public static final String RED="RED";
    String GREEN="GREEN";

}

interface MyNumber{
    public static final int LUCKY_NUMBER=777;
}


