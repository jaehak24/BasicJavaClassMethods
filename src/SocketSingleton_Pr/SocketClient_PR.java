package SocketSingleton_Pr;


public class SocketClient_PR {


    //defult 값을 null 로 세팅
    private static SocketClient_PR socketClientPr=null;

    public SocketClient_PR(){}

    public static SocketClient_PR getInsatcne() {
        if(socketClientPr==null){
            socketClientPr=new SocketClient_PR();
        }
        return socketClientPr;

    }

    public void commit(){System.out.println("연결합니다.");}
}
