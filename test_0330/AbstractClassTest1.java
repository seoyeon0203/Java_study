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
        System.out.println("��ȭ�� ����մϴ�.");
    }
}

class Song extends Media{

    public void play() {
        System.out.println("�뷡�� ����մϴ�.");
    }
}
