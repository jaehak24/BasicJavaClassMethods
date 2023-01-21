package singleton;


//싱글 톤 예제
public class SocketClient {
    private static SocketClient socketClient=null;
    //자신을 객체로 불러옴

    private SocketClient() {} //기본 생성자를 private로 막아줌

    public static SocketClient getInstance() { //어떤 객체에서도 SocketClient 클래스에 접근 가능

        if (socketClient == null) {
            //소켓이 없을 경우에는
            socketClient = new SocketClient();// 새로운 소켓 클라이언트 객체를 배치



        }
        return socketClient;
    }

    public void commit(){
        System.out.println("connect");
    }


}
