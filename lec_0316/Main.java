package lec_0316;

// �α׾ƿ��� ���õ� �۾��� �����ϴ� �̿ϼ� Ŭ����
abstract class LogoutHandler {

    // �⺻������ ��������� ����� �� �������� �������� ����������, �ڽ� Ŭ�������� �α׾ƿ� ����� ������ ������ ����
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

    // �߻� Ŭ���� �������� �α׾ƿ� �ڵ鷯�� ���޹����� ����
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