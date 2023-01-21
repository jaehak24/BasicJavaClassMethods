package singleton;

public class Bclazz {
    private SocketClient socketClient;

    public Bclazz(){ //소켓 클라이언트를 초기화
        this.socketClient=SocketClient.getInstance();
    }

    //get
    public SocketClient getSocketClient(){
        return this.socketClient;
    }

}
