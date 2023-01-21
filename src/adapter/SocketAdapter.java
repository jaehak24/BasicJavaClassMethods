package adapter;

public class SocketAdapter implements Elect_110v,Elect_220v{
    private Elect_220v elect220v; //호환을 위해 220V 클래스를 객체로 불러옴
    private Elect_110v elect110v;


    public SocketAdapter(Elect_220v elect220v){ // 불러온 220 객체 정보를 해당 클래스에 저장
     this.elect220v=elect220v;
    }

    public SocketAdapter(Elect_110v elect_110v){
        this.elect110v=elect_110v;
    }

    @Override
    public void powerOn() {
        elect220v.connect();

    }

    @Override
    public void connect(){
        elect110v.powerOn();
    }
}
