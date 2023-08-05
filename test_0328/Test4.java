package test_0328;

public class Test4 {
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        System.out.println("���� ���� : " +c1.area());
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println("�簢���� �ѷ� : "+r1.perimeter());
    }
}

interface Shape{
    abstract public double area();
    abstract public double perimeter();
}

class Circle{

    //���� ����
    private final double PI = Math.PI;
    private int radius;
    private double area;

    // �Ű������� �ִ� ������
    public Circle(int radius){
        this.radius=radius;
    }

    // �߻� �޼��� ������
    public double area (){
        area = radius*radius*PI;
        return area;
     }
}

class Rectangle {

    // �簢���� �ѷ�
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

