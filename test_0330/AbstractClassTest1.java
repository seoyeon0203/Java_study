package test_0330;

public class AbstractClassTest1 {
}

abstract class Media{

    protected String title;
    protected String genre;
    protected long duration;

    public abstract void play();
}
class Movie extends Media{

    public void play() {
        System.out.println("영화를 재생합니다.");
    }
}

class Song extends Media{

    public void play() {
        System.out.println("노래를 재생합니다.");
    }
}
