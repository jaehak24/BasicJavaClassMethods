package singleton;

public class Aclazz {
    private SocketClient socketClient;

    //기본 생성자로 초기화
    public  Aclazz(){
        this.socketClient=SocketClient.getInstance(); // 소켓 클라이언트를 할당
        //새로운

    }
    // get 메소드
    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
