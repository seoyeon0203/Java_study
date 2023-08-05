package test_0328;

public class Test1 {
    public static void main(String[] args){
        System.out.println(Color.RED);  // 문자열 "RED" 출력
        System.out.println(Color.GREEN); // 문자열 "GREEN" 출력
        System.out.println(MyNumber.LUCKY_NUMBER); // 정수 777 출력
    }
}
interface Color{
    public static final String RED="RED";
    String GREEN="GREEN";

}

interface MyNumber{
    public static final int LUCKY_NUMBER=777;
}


