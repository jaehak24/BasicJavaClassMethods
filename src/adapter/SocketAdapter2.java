package adapter;

public class SocketAdapter2 implements Elect_220v{
    private Elect_110v elect110v;

    public SocketAdapter2(Elect_110v elect110v){
        this.elect110v=elect110v;
    }

    @Override
    public void connect() {
        elect110v.powerOn();
    }
}
