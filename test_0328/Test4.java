package test_0328;

public class Test4 {
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        System.out.println("원의 넓이 : " +c1.area());
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println("사각형의 둘레 : "+r1.perimeter());
    }
}

interface Shape{
    abstract public double area();
    abstract public double perimeter();
}

class Circle{

    //원의 넓이
    private final double PI = Math.PI;
    private int radius;
    private double area;

    // 매개변수가 있는 생성자
    public Circle(int radius){
        this.radius=radius;
    }

    // 추상 메서드 재정의
    public double area (){
        area = radius*radius*PI;
        return area;
     }
}

class Rectangle {

    // 사각형의 둘레
    private double width, height;
    private double perimeter;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double perimeter(){
        perimeter = 2*(width+height);
        return perimeter;

    }
}

