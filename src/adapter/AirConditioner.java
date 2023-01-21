package adapter;

public class AirConditioner implements Elect_220v{
    @Override
    public void connect(){
        System.out.println("에어컨 작동 온");
    }
}
