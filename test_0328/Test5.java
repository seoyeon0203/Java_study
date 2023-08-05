package test_0328;

public class Test5 {
    public static void main(String[] args){
        NormalTaxi normalTaxi = new NormalTaxi(2500);
        normalTaxi.start();
        System.out.println("일반택시 요금: "+normalTaxi.stop(5));
        PremiumTaxi premiumTaxi = new PremiumTaxi(3500);
        premiumTaxi.start();
        System.out.println("프리미엄택시 요금: "+premiumTaxi.stop(5));
    }
}


interface Meter{
    public abstract void start();
    public abstract double stop(double distance);

}

class NormalTaxi implements Meter{
    private double price;
    private boolean isStart = false;

    public NormalTaxi(double price){
        this.price = price;
    }

    public void start() {
        isStart = true;
    }

    public double stop(double distance) {

        if(isStart){
            isStart = false;
            return distance * price;
        }else{
            return 0;
        }

    }
}

class PremiumTaxi implements Meter{
    private double price;
    private boolean isStart = false;

    public PremiumTaxi(double price){
        this.price = price;
    }

    public void start() {
        isStart = true;
    }

    public double stop(double distance) {
        if(isStart){
            isStart = false;
            return distance * price;
        }else{
            return 0;
        }
    }
}


/*추상클래스로 연습
abstract class Meter{
    protected double price;
    protected boolean isStart = false;

    public Meter(double price){
        this.price = price;
    }

    public void start() {
        isStart = true;
    }
    public double stop(double distance) {
        if(isStart){
            isStart = false;
            return calculatePrice(distance);
        }else{
            return 0;
        }

    }

    public abstract double calculatePrice(double distance);
}

class NormalTaxi extends Meter{
    public NormalTaxi(double price){
        super(price);
    }

    @Override
    public double calculatePrice(double distance) {
        return distance * price;
    }
}

class PremiumTaxi extends Meter{

    public PremiumTaxi(double price){
        super(price);
    }

    @Override
    public double calculatePrice(double distance) {
        return distance * price * 2;
    }
}*/

