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
        System.out.println("오디오를 재생합니다.");
    }
    public void pause(){
        System.out.println("오디오를 1분만 재생합니다.");
    }
    public void stop(){
        System.out.println("오디오 재생을 멈춥니다.");
    }
}
