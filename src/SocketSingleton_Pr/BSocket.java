package SocketSingleton_Pr;

public class BSocket {
    private SocketClient_PR socketClientPr;

    public BSocket(SocketClient_PR socketClientPr){
        this.socketClientPr=socketClientPr;
    }
    public SocketClient_PR getSocketClientPr(){return this.socketClientPr;};
}
