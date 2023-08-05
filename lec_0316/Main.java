package lec_0316;

// 로그아웃과 관련된 작업을 진행하는 미완성 클래스
abstract class LogoutHandler {

    // 기본적으로 어느곳에나 사용할 수 있을법한 로직으로 구현하지만, 자식 클래스에서 로그아웃 방법도 완전히 재정의 가능
    protected void doLogout(String user) {
        removeUserInfo(user);
        invalidateUserSession(user);
        afterLogout(user);
    }

    private void removeUserInfo(String user) {
        System.out.println("remove user " + user + " info from server");
    }
    private void invalidateUserSession(String user) {
        System.out.println("invalidate user " + user + " session from server");
    }

    abstract protected void afterLogout(String user);
}

class MyLogoutHandler extends LogoutHandler {
    @Override
    protected void afterLogout(String user) {
        logInfo(user);
        sendGoodByeEmailTo(user);
    }

    private void sendGoodByeEmailTo(String user) {
        System.out.println("send good bye email to user");
    }

    private boolean logInfo(String user) {
        System.out.println("Logging message about logout");
        return true;
    }
}

class WebServer {
    private LogoutHandler logoutHandler;

    // 추상 클래스 형식으로 로그아웃 핸들러를 전달받음을 유의
    public WebServer(LogoutHandler logoutHandler) {
        this.logoutHandler = logoutHandler;
    }

    public void logoutUser(String user) {
        this.logoutHandler.doLogout(user);
    }
}

public class Main {
    public static void main(String[] args) {
        WebServer server = new WebServer(new MyLogoutHandler());
        server.logoutUser("mirim1234");
    }
}