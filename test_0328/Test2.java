package test_0328;

public class Test2 {

}
interface Playable{
    abstract public void play();
    abstract public void pause();
    abstract public void stop();
    }


class AudioPlayer implements Playable{
    public void play(){
        System.out.println("������� ����մϴ�.");
    }
    public void pause(){
        System.out.println("������� 1�и� ����մϴ�.");
    }
    public void stop(){
        System.out.println("����� ����� ����ϴ�.");
    }
}
