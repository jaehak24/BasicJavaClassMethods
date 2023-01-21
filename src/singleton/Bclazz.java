package singleton;

public class Bclazz {
    //private으로 해당 클래스 호출을 방지
    private SocketClient socketClient;

    //SocketClient 클래스로부터 인스턴스를 받아 Bclazz 클래스의 소켓에 정보를 업데이트
    public Bclazz(){ //소켓 클라이언트를 초기화
        this.socketClient=SocketClient.getInstance();
    }

    //다른 클래스에서 Bclazz 클래스를 호출 시 Bclazz 의 socketclient 정보를 반환
    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
