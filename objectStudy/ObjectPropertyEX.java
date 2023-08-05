package objectStudy;

public class ObjectPropertyEX {
    public static void main(String [] args){
        Point P = new Point(2, 3);
        print(P);
    }
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}
class Point{
    private int x, y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}


