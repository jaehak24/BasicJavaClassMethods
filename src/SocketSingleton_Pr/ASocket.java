package SocketSingleton_Pr;

public class ASocket {
    private SocketClient_PR socketClientPr;

    public ASocket(SocketClient_PR socketClientPr){
        this.socketClientPr=socketClientPr;
    }
    public SocketClient_PR getSocketClientPr(){return this.socketClientPr;};
}
