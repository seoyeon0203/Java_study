package lec_0314;

abstract class Shape {
    public Shape() {
    }
    public void paint() {
        draw();
    }
    public void draw(){
    }
}
 class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class AbstractClassStudy {
    public static void main(String [] args){
        // Shape s = new Shape();
        Shape s = new Circle();
        s.draw();
    }

}

